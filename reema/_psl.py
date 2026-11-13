"""A bundled, trimmed public-suffix list.

No network and no third-party PSL package are available at build time, so this
is a curated subset of the Mozilla Public Suffix List: the common gTLDs and
ccTLDs, plus the frequently seen two-level suffixes (``co.uk``, ``com.au`` …).
It is deliberately not exhaustive — it exists to tell a real registrable domain
from a dotted code identifier (``coroutineId.id``), not to be authoritative.

`public_suffix("a.evil.co.uk")` -> "co.uk"; `registrable_domain(...)` -> "evil.co.uk".
"""

# Single-label suffixes (TLDs).
_TLDS = {
    # common gTLDs
    "com", "net", "org", "info", "biz", "name", "pro", "mobi", "xyz", "top", "site",
    "online", "club", "app", "dev", "io", "co", "ai", "me", "tv", "cc", "tech", "store",
    "shop", "live", "cloud", "digital", "world", "life", "fun", "icu", "vip", "work",
    "space", "website", "press", "host", "link", "click", "download", "stream", "gdn",
    "cyou", "sbs", "pw", "cam", "monster", "quest", "bar", "rest", "fit", "run", "wiki",
    "email", "news", "today", "art", "blog", "page", "group", "agency", "solutions",
    # infrastructure / misc gTLDs sometimes abused
    "zip", "mov", "cfd", "lol", "bond", "beauty", "makeup", "skin", "hair", "autos",
    # ccTLDs
    "us", "uk", "de", "fr", "it", "es", "nl", "ru", "cn", "jp", "kr", "in", "br", "au",
    "ca", "mx", "id", "my", "sg", "th", "vn", "ph", "tw", "hk", "se", "no", "fi", "dk",
    "pl", "tr", "ua", "ir", "pk", "ng", "za", "eg", "sa", "ae", "il", "gr", "pt", "cz",
    "ro", "hu", "at", "ch", "be", "ie", "nz", "cl", "ar", "pe", "ve", "ec", "bo", "py",
    "uy", "kz", "by", "ge", "am", "az", "lk", "bd", "np", "mm", "kh", "la", "mn", "lk",
    "tk", "ml", "ga", "cf", "gq", "su", "to", "ws", "cm", "ke", "tz", "gh", "ma", "dz",
    "tn", "ug", "zm", "zw", "sn", "ci", "md", "mk", "al", "ba", "rs", "si", "hr", "lt",
    "lv", "ee", "is", "lu", "mt", "cy", "li", "mc", "sm", "ad",
}

# Two-level public suffixes.
_MULTI = {
    "co.uk", "org.uk", "me.uk", "ac.uk", "gov.uk", "net.uk", "sch.uk", "ltd.uk", "plc.uk",
    "co.jp", "or.jp", "ne.jp", "ac.jp", "go.jp", "ad.jp", "ed.jp", "gr.jp", "lg.jp",
    "co.kr", "or.kr", "ne.kr", "re.kr", "pe.kr", "go.kr", "ac.kr",
    "com.au", "net.au", "org.au", "edu.au", "gov.au", "asn.au", "id.au",
    "com.br", "net.br", "org.br", "gov.br", "edu.br",
    "com.cn", "net.cn", "org.cn", "gov.cn", "edu.cn", "ac.cn",
    "com.tr", "net.tr", "org.tr", "gov.tr", "edu.tr",
    "co.za", "org.za", "net.za", "gov.za", "ac.za",
    "com.sg", "edu.sg", "net.sg", "org.sg", "gov.sg",
    "com.my", "net.my", "org.my", "gov.my", "edu.my",
    "co.th", "in.th", "ac.th", "go.th", "or.th",
    "com.vn", "net.vn", "org.vn", "gov.vn", "edu.vn",
    "co.id", "or.id", "ac.id", "go.id", "web.id", "my.id", "biz.id",
    "co.in", "net.in", "org.in", "gen.in", "firm.in", "gov.in", "ac.in",
    "com.ph", "net.ph", "org.ph", "gov.ph",
    "com.hk", "net.hk", "org.hk", "edu.hk", "gov.hk",
    "com.tw", "net.tw", "org.tw", "gov.tw", "edu.tw",
    "com.mx", "org.mx", "gob.mx", "edu.mx",
    "com.ru", "net.ru", "org.ru", "edu.ru", "gov.ru",
    "com.ua", "net.ua", "org.ua", "gov.ua", "edu.ua",
    "com.pk", "net.pk", "org.pk", "gov.pk", "edu.pk",
    "com.ng", "net.ng", "org.ng", "gov.ng", "edu.ng",
    "com.eg", "net.eg", "org.eg", "gov.eg", "edu.eg",
    "com.sa", "net.sa", "org.sa", "gov.sa", "edu.sa",
    "com.ar", "net.ar", "org.ar", "gov.ar", "edu.ar",
    "co.il", "org.il", "net.il", "gov.il", "ac.il",
}

PUBLIC_SUFFIXES = _TLDS | _MULTI


def public_suffix(host):
    """Longest public suffix of host, or None when host has no known suffix."""
    if not host:
        return None
    labels = host.lower().strip(".").split(".")
    for i in range(len(labels)):
        candidate = ".".join(labels[i:])
        if candidate in PUBLIC_SUFFIXES:
            return candidate
    return None


def registrable_domain(host):
    """host reduced to one label above its public suffix (``a.b.evil.co.uk`` -> ``evil.co.uk``),
    or None when host is itself a public suffix or has none."""
    suffix = public_suffix(host)
    if not suffix:
        return None
    labels = host.lower().strip(".").split(".")
    suffix_len = suffix.count(".") + 1
    if len(labels) <= suffix_len:
        return None  # host is a bare public suffix, not a registrable name
    return ".".join(labels[-(suffix_len + 1):])
