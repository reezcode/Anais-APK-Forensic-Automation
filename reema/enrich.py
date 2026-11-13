"""Online enrichment: reputation and family labels for a sample hash.

Policy (ADR 0004): only the SHA-256 leaves the machine; samples are never
uploaded. --offline reads the cache and sends nothing. API keys come from
REEMA_<PROVIDER>_API_KEY env vars. A provider failure never fails the analysis.

Output: <case_dir>/temp/enrichment.json
Cache:  $REEMA_CACHE_DIR/enrichment.db (default ~/.anais/cache)
"""

import json
import os
import re
import sqlite3
import time
import urllib.error
import urllib.parse
import urllib.request
from collections import Counter
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


def _http_json(url, obj, headers=None):
    """POST a JSON body and return (http_status, parsed_json). Network errors raise OSError."""
    body = json.dumps(obj).encode()
    req = urllib.request.Request(url, data=body, headers={
        "User-Agent": "reema", "Content-Type": "application/json", **(headers or {})})
    try:
        with urllib.request.urlopen(req, timeout=TIMEOUT) as resp:
            return resp.status, json.load(resp)
    except urllib.error.HTTPError as e:
        try:
            return e.code, json.load(e)
        except ValueError:
            return e.code, {}


def _http_multipart(url, fields, file_field, filename, filedata, headers=None):
    """POST a multipart/form-data body with one file. Returns (http_status, parsed_json)."""
    boundary = "----reema" + os.urandom(16).hex()
    parts = []
    for k, v in (fields or {}).items():
        parts.append(f"--{boundary}\r\nContent-Disposition: form-data; name=\"{k}\"\r\n\r\n{v}\r\n".encode())
    parts.append(f"--{boundary}\r\nContent-Disposition: form-data; name=\"{file_field}\"; "
                 f"filename=\"{filename}\"\r\nContent-Type: application/octet-stream\r\n\r\n".encode())
    body = b"".join(parts) + filedata + f"\r\n--{boundary}--\r\n".encode()
    req = urllib.request.Request(url, data=body, headers={
        "User-Agent": "reema", "Content-Type": f"multipart/form-data; boundary={boundary}", **(headers or {})})
    try:
        with urllib.request.urlopen(req, timeout=max(TIMEOUT, 120)) as resp:
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

    def upload(self, path, key):
        code, body = _http_multipart("https://mb-api.abuse.ch/api/v1/", {}, "file",
                                     Path(path).name, Path(path).read_bytes(), {"Auth-Key": key})
        status = (body or {}).get("query_status")
        if code == 200 and status in ("ok", "duplicate_file_not_added"):
            return "uploaded", {"query_status": status}
        return "error", {"http_status": code, "query_status": status}


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

    def upload(self, path, key):
        code, body = _http_multipart("https://www.virustotal.com/api/v3/files", {}, "file",
                                     Path(path).name, Path(path).read_bytes(), {"x-apikey": key})
        if code in (200, 201):
            return "uploaded", {"analysis_id": (body.get("data") or {}).get("id")}
        return "error", {"http_status": code}


class Koodous:
    name = "koodous"
    key_env = "REEMA_KOODOUS_API_KEY"

    def lookup(self, sha256, key):
        code, body = _http(f"https://api.koodous.com/apks/{sha256}",
                           headers={"Authorization": f"Token {key}"})
        if code == 404:
            return "not_found", {}
        if code != 200 or not isinstance(body, dict):
            return "error", {"http_status": code}
        return "found", {
            "detected": bool(body.get("is_detected") or body.get("detected")),
            "rating": body.get("rating"),
            "tags": list((body.get("tags") or {}).keys()) if isinstance(body.get("tags"), dict)
                    else (body.get("tags") or []),
            "link": f"https://koodous.com/apks/{sha256}",
        }


class HybridAnalysis:
    name = "hybridanalysis"
    key_env = "REEMA_HYBRIDANALYSIS_API_KEY"

    def lookup(self, sha256, key):
        # HA rejects requests without this exact User-Agent.
        code, body = _http("https://www.hybrid-analysis.com/api/v2/search/hash", {"hash": sha256},
                           {"api-key": key, "User-Agent": "Falcon Sandbox", "Accept": "application/json"})
        if code != 200:
            return "error", {"http_status": code}
        reports = body if isinstance(body, list) else []
        if not reports:
            return "not_found", {}
        r = max(reports, key=lambda x: x.get("threat_score") or 0)
        return "found", {
            "verdict": r.get("verdict"),
            "threat_score": r.get("threat_score"),
            "family": r.get("vx_family"),
            "av_detect": r.get("av_detect"),
            "link": f"https://www.hybrid-analysis.com/sample/{sha256}",
        }


PROVIDERS = [MalwareBazaar(), VirusTotal(), Koodous(), HybridAnalysis()]


# --- IOC feeds (B5) ------------------------------------------------------------
# These query an extracted indicator (a URL, domain or IP), not the sample hash.
# abuse.ch now requires an Auth-Key for every feed, so without a key a feed is
# skipped like any other provider. Interface: kinds, lookup_ioc(value, kind, key).

class ThreatFox:
    name = "threatfox"
    key_env = "REEMA_THREATFOX_API_KEY"
    kinds = ("urls", "domains", "ips")

    def lookup_ioc(self, value, kind, key):
        code, body = _http_json("https://threatfox-api.abuse.ch/api/v1/",
                                {"query": "search_ioc", "search_term": value}, {"Auth-Key": key})
        status = (body or {}).get("query_status")
        if status in ("no_result", "illegal_search_term"):
            return "not_found", {}
        if status != "ok" or not body.get("data"):
            return "error", {"query_status": status, "http_status": code}
        d = body["data"][0]
        return "found", {
            "malware": d.get("malware_printable") or d.get("malware"),
            "threat_type": d.get("threat_type"),
            "confidence": d.get("confidence_level"),
            "tags": d.get("tags") or [],
            "first_seen": d.get("first_seen_utc"),
            "link": d.get("reference") or f"https://threatfox.abuse.ch/browse/ioc/{d.get('id', '')}",
        }


class URLhaus:
    name = "urlhaus"
    key_env = "REEMA_URLHAUS_API_KEY"
    kinds = ("urls", "domains", "ips")

    def lookup_ioc(self, value, kind, key):
        if kind == "urls":
            endpoint, field = "url/", "url"
        else:
            endpoint, field = "host/", "host"
        code, body = _http(f"https://urlhaus-api.abuse.ch/v1/{endpoint}", {field: value}, {"Auth-Key": key})
        status = (body or {}).get("query_status")
        if status in ("no_results", "invalid_url", "invalid_host"):
            return "not_found", {}
        if status != "ok":
            return "error", {"query_status": status, "http_status": code}
        if kind == "urls":
            data = {"threat": body.get("threat"), "status": body.get("url_status"),
                    "tags": body.get("tags") or [], "link": body.get("urlhaus_reference")}
        else:
            urls = body.get("urls") or []
            data = {"threat": "malware_host" if urls else None, "url_count": len(urls),
                    "blacklists": body.get("blacklists") or {},
                    "link": f"https://urlhaus.abuse.ch/host/{value}/"}
        return "found", data


IOC_PROVIDERS = [ThreatFox(), URLhaus()]


# Tokens that name a category, platform or detection artefact, not a family.
# Dropping them (AVclass-style) leaves the actual family name to vote on.
_GENERIC_TOKENS = {
    "a", "b", "c", "android", "androidos", "android_os", "andr", "os", "linux", "win32", "win64",
    "trojan", "trj", "troj", "virus", "worm", "malware", "mal", "riskware", "pua", "pup", "adware",
    "spyware", "spr", "spy", "ransom", "ransomware", "banker", "bank", "dropper", "downloader",
    "backdoor", "rootkit", "exploit", "hacktool", "generic", "gen", "genpack", "agent", "heur",
    "heuristic", "variant", "ml", "ai", "cloud", "static", "behaveslike", "susp", "suspicious",
    "application", "program", "unwanted", "potentially", "artemis", "eldorado", "score", "v",
}
_FAMILY_RE = re.compile(r"[A-Za-z][A-Za-z0-9]+")


def _family_tokens(label):
    """Family-name candidates from one engine label, generic noise removed."""
    if not label:
        return []
    out = []
    for tok in _FAMILY_RE.findall(str(label)):
        low = tok.lower()
        if low in _GENERIC_TOKENS or len(low) < 3 or low.isdigit():
            continue
        out.append(low)
    return out


def normalize_family(doc):
    """Reduce every engine's family label to one family name with a confidence.

    AVclass-style majority vote over the label tokens, after stripping category
    and platform words. Feeds the P2 verdict. Returns {family, confidence, candidates}.
    """
    votes = Counter()
    providers = (doc or {}).get("providers", {})

    def feed(provider, *labels):
        if providers.get(provider, {}).get("status") != "found":
            return
        for label in labels:
            if isinstance(label, (list, tuple)):
                for item in label:
                    votes.update(_family_tokens(item))
            else:
                votes.update(_family_tokens(label))

    feed("malwarebazaar", _pget(providers, "malwarebazaar", "family"), _pget(providers, "malwarebazaar", "tags"))
    feed("virustotal", _pget(providers, "virustotal", "label"))
    feed("hybridanalysis", _pget(providers, "hybridanalysis", "family"))
    feed("koodous", _pget(providers, "koodous", "tags"))

    if not votes:
        return {"family": None, "confidence": "low", "candidates": {}}
    family, top = votes.most_common(1)[0]
    # Confidence tracks agreement: several engines on the same name is strong.
    confidence = "high" if top >= 3 else "medium" if top >= 2 else "low"
    return {"family": family, "confidence": confidence, "candidates": dict(votes.most_common(5))}


def _pget(providers, name, field):
    return (providers.get(name, {}).get("data", {}) or {}).get(field)


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
    doc = {"sha256": sha256, "offline": offline, "providers": results}
    doc["family"] = normalize_family(doc)
    return doc


def run_iocs(iocs, offline=False, case=None, cache=None, providers=None, max_per_kind=50):
    """Query extracted indicators against the IOC feeds (B5). Returns {offline, hits}.

    iocs is {urls, domains, ips} from reema.iocs.extract. Results cache per
    (provider, "kind:value") with the same TTLs as hash lookups, so a repeat run
    stays offline. Only the indicators (never the sample) leave the machine; each
    live query is audited in case.json.
    """
    cache = cache or Cache()
    providers = providers or IOC_PROVIDERS
    hits = []
    for kind in ("urls", "domains", "ips"):
        for value in (iocs.get(kind) or [])[:max_per_kind]:
            for p in providers:
                if kind not in p.kinds:
                    continue
                ckey = f"{kind}:{value}"
                cached = cache.get(p.name, ckey)
                if cached:
                    status, data = cached["status"], cached["data"]
                elif offline or not os.environ.get(p.key_env):
                    continue
                else:
                    try:
                        status, data = p.lookup_ioc(value, kind, os.environ[p.key_env])
                    except (OSError, ValueError) as e:
                        status, data = "error", {"error": str(e)}
                    if status in ("found", "not_found"):
                        cache.put(p.name, ckey, status, data)
                    if case is not None:
                        case.add_enrichment(p.name, {"ioc": value, "kind": kind[:-1]}, status, cached=False)
                if status == "found":
                    hits.append({"provider": p.name, "kind": kind[:-1], "value": value,
                                 "data": data, "cached": bool(cached)})
    return {"offline": offline, "hits": hits}


def upload(sample_path, case=None, providers=None):
    """Upload the sample itself to every provider that supports it and holds a key.

    ADR 0004: this sends the sample bytes off the machine, so it runs only on the
    caller's explicit opt-in (`reema analyze --upload`). Every upload is audited in
    case.json, flagged so the record shows the sample left the machine.
    """
    results = {}
    for p in providers or PROVIDERS:
        if not hasattr(p, "upload"):
            continue
        if not os.environ.get(p.key_env):
            results[p.name] = {"status": "skipped_no_key"}
            continue
        try:
            status, data = p.upload(sample_path, os.environ[p.key_env])
        except (OSError, ValueError) as e:
            status, data = "error", {"error": str(e)}
        results[p.name] = {"status": status, "data": data}
        if case is not None:
            case.add_enrichment(p.name, {"sample": Path(sample_path).name, "sample_uploaded": True},
                                status, cached=False)
    return results
