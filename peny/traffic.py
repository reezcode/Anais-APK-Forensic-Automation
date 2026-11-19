"""Captured HTTP(S) traffic from a proxied Dyxon lease (D-C1).

Peny does not run the proxy; the operator points the device at Burp/mitmproxy
(the D-C1 `network="proxy"` lease) and exports the session. Peny reads that export
as a tool-agnostic list of `Flow`s. HAR is the interchange format every proxy can
produce, so that is the one reader here; other formats are a thin add later.
"""

import base64
import json
from dataclasses import dataclass, field
from pathlib import Path
from typing import Dict, List, Optional
from urllib.parse import urlsplit


@dataclass
class Flow:
    """One request/response pair observed on the wire."""

    method: str
    url: str
    req_headers: Dict[str, str] = field(default_factory=dict)  # header names lower-cased
    req_body: str = ""
    status: int = 0
    resp_headers: Dict[str, str] = field(default_factory=dict)
    resp_body: str = ""

    @property
    def scheme(self):
        return urlsplit(self.url).scheme

    @property
    def host(self):
        return urlsplit(self.url).netloc

    @property
    def path(self):
        return urlsplit(self.url).path

    def header(self, name):
        return self.req_headers.get(name.lower())


def _headers(entries):
    return {h.get("name", "").lower(): h.get("value", "") for h in entries or []}


def _har_body(section):
    """Extract a request postData / response content body as text."""
    if not section:
        return ""
    text = section.get("text", "")
    if section.get("encoding") == "base64" and text:
        try:
            return base64.b64decode(text).decode("utf-8", "replace")
        except Exception:
            return ""
    return text or ""


def load_flows(path):
    """Read a HAR file into Flows. Returns [] on a missing or malformed file."""
    try:
        data = json.loads(Path(path).read_text(encoding="utf-8"))
    except (OSError, ValueError):
        return []
    entries = (data.get("log") or {}).get("entries") or []
    flows = []
    for e in entries:
        req = e.get("request") or {}
        resp = e.get("response") or {}
        flows.append(Flow(
            method=req.get("method", "GET"),
            url=req.get("url", ""),
            req_headers=_headers(req.get("headers")),
            req_body=_har_body(req.get("postData")),
            status=int(resp.get("status", 0) or 0),
            resp_headers=_headers(resp.get("headers")),
            resp_body=_har_body(resp.get("content")),
        ))
    return flows
