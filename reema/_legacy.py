"""Access to the legacy analyzers in analysis_tools/ while they are migrated.

Importing this module puts analysis_tools/ on sys.path once, so Reema can
reuse legacy code (e.g. the SDK table) without copying it.
"""

import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
TOOLS_DIR = ROOT / "analysis_tools"
RULES_DIR = ROOT / "rules"

if str(TOOLS_DIR) not in sys.path:
    sys.path.insert(0, str(TOOLS_DIR))

from sdk_inventory import owner_of  # noqa: E402

__all__ = ["ROOT", "TOOLS_DIR", "RULES_DIR", "owner_of"]
