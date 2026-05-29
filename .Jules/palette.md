## 2025-05-14 - Fixing "Broken" Developer Experience
**Learning:** In a data/code-only repository, the UX is defined by file naming, syntax validity, and information hierarchy. Appending metadata to source files (e.g., Ethereum addresses after a closing brace) breaks developer tools (linters, compilers, JSON parsers) and creates a poor first impression.
**Action:** Always verify syntax validity (e.g., `python3 -m json.tool` for JSON, `javac` for Java) when cleaning up files. Move non-standard metadata to a structured section in `README.md` to preserve information without breaking the code.
