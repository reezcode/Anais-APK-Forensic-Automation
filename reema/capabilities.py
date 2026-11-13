"""Capability engine: match data-driven rules against the code index and manifest.

A capability rule is a YAML file in reema/capabilities/. Each rule names
conditions over four fact sources, all drawn from the case output:

  - api         framework API calls      (code_index.db api_calls)
  - string      string constants         (code_index.db strings)
  - permission  requested permissions    (temp/basic_info.json)
  - component   declared components       (temp/basic_info.json, manifest findings)

The engine is content-free: every technique lives in a rule file, so an
analyst adds a capability without touching code. Rule format and an example:
docs/reema/capability-rules.md. Behaviour chains combine capabilities, see
chains.py.

A matched capability becomes a Finding (source "capability", axis "malice")
carrying its ATT&CK IDs, the evidence that matched, and the owner/reachability
of the code it was found in.
"""

import sqlite3
from pathlib import Path

import yaml

from reema._legacy import owner_of
from reema.findings import Evidence, Finding

RULES_DIR = Path(__file__).resolve().parent / "capabilities"
VALID_SOURCES = {"api", "string", "permission", "component"}
# How many evidence rows to keep per condition, so one noisy match can't bloat a finding.
EVIDENCE_LIMIT = 10


class RuleError(ValueError):
    """A rule file is malformed. The loader collects these; a bad rule never
    silently matches nothing."""


def _as_list(value):
    if value is None:
        return []
    return value if isinstance(value, list) else [value]


class Rule:
    """One capability rule. See docs/reema/capability-rules.md for the fields."""

    def __init__(self, data, path):
        self.path = path
        self.id = data.get("id")
        if not self.id or not isinstance(self.id, str):
            raise RuleError(f"{path}: 'id' is required and must be a string")
        self.title = data.get("title", self.id)
        self.severity = data.get("severity", "high")
        self.attck = _as_list(data.get("attck"))
        self.tags = _as_list(data.get("tags"))
        self.description = data.get("description", "")
        self.recommendation = data.get("recommendation", "")
        self.defense = data.get("defense", "")

        # requires: every group must match (AND). any_of: at least `any_of_min`
        # of the conditions must match (default 1, i.e. OR). A higher any_of_min
        # expresses a constellation: "at least N of these must co-occur".
        self.requires = [Condition(c, path) for c in _as_list(data.get("requires"))]
        self.any_of = [Condition(c, path) for c in _as_list(data.get("any_of"))]
        if not self.requires and not self.any_of:
            raise RuleError(f"{path}: rule {self.id!r} has neither 'requires' nor 'any_of'")
        self.any_of_min = int(data.get("any_of_min", 1))
        if self.any_of_min < 1 or (self.any_of and self.any_of_min > len(self.any_of)):
            raise RuleError(f"{path}: rule {self.id!r} any_of_min {self.any_of_min} "
                            f"out of range 1..{len(self.any_of)}")

    def evaluate(self, facts):
        """Return a Match when the rule fires, else None."""
        hits = []
        for cond in self.requires:
            found = cond.match(facts)
            if not found:
                return None
            hits.extend(found)
        if self.any_of:
            matched, any_hits = 0, []
            for cond in self.any_of:
                found = cond.match(facts)
                if found:
                    matched += 1
                    any_hits.extend(found)
            if matched < self.any_of_min:
                return None
            hits.extend(any_hits)
        return Match(self, hits)


class Condition:
    """A single `source: patterns` test. Patterns match by case-insensitive substring,
    so a rule need not spell out full descriptors."""

    def __init__(self, data, path):
        if not isinstance(data, dict) or len(data) != 1:
            raise RuleError(f"{path}: each condition must be a one-key mapping, got {data!r}")
        (self.source, patterns), = data.items()
        if self.source not in VALID_SOURCES:
            raise RuleError(f"{path}: unknown condition source {self.source!r}; "
                            f"use one of {sorted(VALID_SOURCES)}")
        self.patterns = [str(p).lower() for p in _as_list(patterns)]
        if not self.patterns:
            raise RuleError(f"{path}: condition {self.source!r} has no patterns")

    def match(self, facts):
        """Return matching Hits (at most EVIDENCE_LIMIT). A condition matches when any
        pattern is a substring of any fact of its source."""
        hits = []
        for value, where in facts.get(self.source, ()):
            low = value.lower()
            if any(p in low for p in self.patterns):
                hits.append(Hit(self.source, value, where))
                if len(hits) >= EVIDENCE_LIMIT:
                    break
        return hits


class Hit:
    __slots__ = ("source", "value", "where")

    def __init__(self, source, value, where):
        self.source = source
        self.value = value
        self.where = where  # a Facts "where" string: class descriptor, "manifest", etc.


class Match:
    def __init__(self, rule, hits):
        self.rule = rule
        self.hits = hits

    def owners(self):
        # Code evidence is attributed by its class; manifest evidence (a declared
        # permission or component) is the sample's own declaration, so it is
        # app-owned. Without this, a permission-only capability can never reach
        # owner "app" and the verdict ignores it (e.g. a packed app whose code is
        # unavailable but whose manifest declares dangerous permissions).
        owners = set()
        for h in self.hits:
            if h.where and h.where.startswith("L"):
                owners.add(owner_of(h.where))
            elif h.where == "manifest":
                owners.add("app")
        owners.discard("")
        return owners


def load_rules(rules_dir=RULES_DIR):
    """Load every *.yaml rule. Returns (rules, errors). A broken file is reported in
    errors and skipped, so one typo never drops the whole set silently."""
    rules, errors = [], []
    rules_dir = Path(rules_dir)
    if not rules_dir.is_dir():
        return rules, errors
    seen = {}
    for path in sorted(rules_dir.glob("*.yaml")) + sorted(rules_dir.glob("*.yml")):
        try:
            docs = list(yaml.safe_load_all(path.read_text(encoding="utf-8")))
        except yaml.YAMLError as e:
            errors.append(f"{path}: YAML error: {e}")
            continue
        for data in docs:
            if data is None:
                continue
            try:
                rule = Rule(data, path)
            except RuleError as e:
                errors.append(str(e))
                continue
            if rule.id in seen:
                errors.append(f"{path}: duplicate capability id {rule.id!r} (also in {seen[rule.id]})")
                continue
            seen[rule.id] = path
            rules.append(rule)
    return rules, errors


class Facts:
    """The facts a case offers the engine, grouped by source. Each entry is
    (value, where); `where` is the class descriptor for code facts, or a label
    like "manifest" for manifest facts, and drives owner/reachability tagging."""

    def __init__(self):
        self.data = {s: [] for s in VALID_SOURCES}

    def add(self, source, value, where):
        if value:
            self.data[source].append((str(value), where or ""))

    def get(self, source, default=()):
        return self.data.get(source, default)

    @classmethod
    def from_case(cls, case_dir):
        import json
        case_dir = Path(case_dir)
        facts = cls()

        info_path = case_dir / "temp" / "basic_info.json"
        try:
            info = json.loads(info_path.read_text(encoding="utf-8"))
        except (OSError, ValueError):
            info = {}
        for perm in info.get("permissions", []) or []:
            facts.add("permission", perm, "manifest")
        for key in ("activities", "services", "receivers", "providers"):
            for comp in info.get(key, []) or []:
                facts.add("component", comp, "manifest")

        db = case_dir / "temp" / "code_index.db"
        if db.is_file():
            # timeout waits out a transient lock from a still-open writer rather
            # than failing instantly; close deterministically (a bare `with`
            # commits but leaks the connection).
            con = sqlite3.connect(db, timeout=30)
            try:
                tables = {r[0] for r in con.execute("SELECT name FROM sqlite_master WHERE type='table'")}
                if "api_calls" in tables:
                    for api, cls_name in con.execute(
                            "SELECT a.api, c.name FROM api_calls a JOIN classes c ON c.id = a.class_id"):
                        facts.add("api", api, cls_name)
                if "strings" in tables:  # absent in indexes built before 0.3.0
                    for value, cls_name in con.execute(
                            "SELECT s.value, c.name FROM strings s JOIN classes c ON c.id = s.class_id"):
                        facts.add("string", value, cls_name)
            finally:
                con.close()
        return facts


def match_rules(facts, rules):
    """Return the Matches for every rule that fires against facts."""
    return [m for m in (r.evaluate(facts) for r in rules) if m is not None]


def match_to_finding(match):
    rule = match.rule
    owners = match.owners()
    in_app = "app" in owners
    evidence = [Evidence(file=h.where or "(manifest)", snippet=f"{h.source}: {h.value}"[:300])
                for h in match.hits[:EVIDENCE_LIMIT]]
    # A capability seen only in library code is reported but not trusted as the
    # sample author's own behaviour.
    confidence = "high" if in_app else ("medium" if not owners else "low")
    tags = list(rule.tags) + [f"capability:{rule.id}"]
    return Finding(
        source="capability",
        rule=rule.id,
        title=rule.title,
        severity=rule.severity,
        axis="malice",
        confidence=confidence,
        category="capability",
        description=rule.description,
        recommendation=rule.recommendation,
        evidence=evidence or [Evidence(file="(no evidence captured)")],
        attck=rule.attck,
        tags=tags,
        owner="app" if in_app else (sorted(owners)[0] if owners else ""),
    )
