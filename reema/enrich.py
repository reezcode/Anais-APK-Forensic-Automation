"""Online enrichment: reputation and family labels for a sample hash.

Policy (ADR 0004): only the SHA-256 leaves the machine; samples are never
uploaded. --offline reads the cache and sends nothing. API keys come from
REEMA_<PROVIDER>_API_KEY env vars. A provider failure never fails the analysis.

Output: <case_dir>/temp/enrichment.json
Cache:  $REEMA_CACHE_DIR/enrichment.db (default ~/.anais/cache)
"""

import json
import os
import sqlite3
import time
import urllib.error
import urllib.parse
import urllib.request
from pathlib import Path

TIMEOUT = 20
TTL_FOUND = 7 * 24 * 3600
TTL_NOT_FOUND = 24 * 3600


def cache_path():
    root = Path(os.environ.get("REEMA_CACHE_DIR") or Path.home() / ".anais" / "cache").expanduser()
    root.mkdir(parents=True, exist_ok=True)
    return root / "enrichment.db"


class Cache:
    def __init__(self, path=None):
        self.db = sqlite3.connect(path or cache_path())
        self.db.execute("CREATE TABLE IF NOT EXISTS lookups (provider TEXT, key TEXT, fetched_at REAL, "
                        "status TEXT, body TEXT, PRIMARY KEY (provider, key))")

    def get(self, provider, key, now=None):
        row = self.db.execute("SELECT fetched_at, status, body FROM lookups WHERE provider=? AND key=?",
                              (provider, key)).fetchone()
        if not row:
            return None
        fetched_at, status, body = row
        ttl = TTL_FOUND if status == "found" else TTL_NOT_FOUND
        if (now or time.time()) - fetched_at > ttl:
            return None
        return {"status": status, "data": json.loads(body)}

    def put(self, provider, key, status, data):
        self.db.execute("INSERT OR REPLACE INTO lookups VALUES (?, ?, ?, ?, ?)",
                        (provider, key, time.time(), status, json.dumps(data)))
        self.db.commit()


def _http(url, data=None, headers=None):
    """Return (http_status, parsed_json). Network errors raise OSError."""
    body = urllib.parse.urlencode(data).encode() if data else None
    req = urllib.request.Request(url, data=body, headers={"User-Agent": "reema", **(headers or {})})
    try:
        with urllib.request.urlopen(req, timeout=TIMEOUT) as resp:
            return resp.status, json.load(resp)
    except urllib.error.HTTPError as e:
        try:
            return e.code, json.load(e)
        except ValueError:
            return e.code, {}


class MalwareBazaar:
    name = "malwarebazaar"
    key_env = "REEMA_MALWAREBAZAAR_API_KEY"

    def lookup(self, sha256, key):
        _, body = _http("https://mb-api.abuse.ch/api/v1/", {"query": "get_info", "hash": sha256},
                        {"Auth-Key": key})
        status = body.get("query_status")
        if status == "hash_not_found":
            return "not_found", {}
        if status != "ok" or not body.get("data"):
            return "error", {"query_status": status}
        d = body["data"][0]
        return "found", {
            "family": d.get("signature"),
            "tags": d.get("tags") or [],
            "first_seen": d.get("first_seen"),
            "file_type": d.get("file_type"),
            "link": f"https://bazaar.abuse.ch/sample/{sha256}/",
        }


class VirusTotal:
    name = "virustotal"
    key_env = "REEMA_VIRUSTOTAL_API_KEY"

    def lookup(self, sha256, key):
        code, body = _http(f"https://www.virustotal.com/api/v3/files/{sha256}", headers={"x-apikey": key})
        if code == 404:
            return "not_found", {}
        if code != 200:
            return "error", {"http_status": code}
        attrs = body.get("data", {}).get("attributes", {})
        stats = attrs.get("last_analysis_stats", {})
        return "found", {
            "malicious": stats.get("malicious", 0),
            "suspicious": stats.get("suspicious", 0),
            "undetected": stats.get("undetected", 0),
            "label": (attrs.get("popular_threat_classification") or {}).get("suggested_threat_label"),
            "first_submission": attrs.get("first_submission_date"),
            "link": f"https://www.virustotal.com/gui/file/{sha256}",
        }


PROVIDERS = [MalwareBazaar(), VirusTotal()]


def run(sha256, offline=False, case=None, cache=None, providers=None):
    """Look sha256 up with every provider. Returns the enrichment document."""
    cache = cache or Cache()
    results = {}
    for p in providers or PROVIDERS:
        hit = cache.get(p.name, sha256)
        if hit:
            results[p.name] = {**hit, "cached": True}
        elif offline:
            results[p.name] = {"status": "skipped_offline", "data": {}, "cached": False}
        elif not os.environ.get(p.key_env):
            results[p.name] = {"status": "skipped_no_key", "data": {}, "cached": False}
        else:
            try:
                status, data = p.lookup(sha256, os.environ[p.key_env])
            except (OSError, ValueError) as e:
                status, data = "error", {"error": str(e)}
            if status in ("found", "not_found"):
                cache.put(p.name, sha256, status, data)
            results[p.name] = {"status": status, "data": data, "cached": False}
            if case is not None:
                case.add_enrichment(p.name, {"sha256": sha256}, status, cached=False)
    return {"sha256": sha256, "offline": offline, "providers": results}
