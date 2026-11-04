#!/usr/bin/env bash
#
# Install Anais agent skill(s) into a host's skill directory.
#
# Usage:
#   scripts/install_skills.sh [TARGET_DIR]
#
# TARGET_DIR defaults to ~/.claude/skills (Claude Code / Claude Desktop user
# scope). For another host, pass its skill directory, e.g.:
#   scripts/install_skills.sh ~/.config/<host>/skills
#
# The canonical skills live in <repo>/skills/. This copies each skill directory
# (resolving symlinks) into TARGET_DIR, overwriting an existing copy.
set -euo pipefail

REPO_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
SRC="${REPO_DIR}/skills"
TARGET="${1:-${HOME}/.claude/skills}"

if [ ! -d "$SRC" ]; then
  echo "error: no skills directory at $SRC" >&2
  exit 1
fi

mkdir -p "$TARGET"
for skill in "$SRC"/*/; do
  name="$(basename "$skill")"
  dest="${TARGET}/${name}"
  rm -rf "$dest"
  # -L/-R: dereference symlinks so a real copy lands in the host dir.
  cp -RL "$skill" "$dest"
  echo "installed: $name -> $dest"
done

echo "done. Restart/reconnect your host to pick up the skill(s)."
