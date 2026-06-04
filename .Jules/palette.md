## 2026-06-04 - Metadata Sanitization and Information Hierarchy
**Learning:** In a data/code-only repository, appending metadata to source files (e.g., Ethereum addresses after a closing brace) breaks developer tools like linters and compilers; these should be moved to README.md to preserve syntax validity.
**Action:** Always verify syntax validity (e.g., JSON validation, compilation) after sanitizing files, and consolidate non-sensitive metadata in the README to improve DX.
