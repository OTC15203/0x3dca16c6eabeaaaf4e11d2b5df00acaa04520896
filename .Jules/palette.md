## 2025-05-14 - [Information Hierarchy in Data Repositories]
**Learning:** In repositories lacking a traditional web UI, the 'interface' is defined by the file structure, documentation (README), and data formatting. Improving hierarchy via tables and descriptive filenames significantly enhances Developer Experience (DX).
**Action:** Always rename ambiguous files (e.g., 'Payment', 'More') to descriptive ones with correct extensions and use structured tables in README.md.

## 2025-05-14 - [Sanitizing Metadata in Source Files]
**Learning:** Appending metadata (like Ethereum addresses or hashes) after code/config delimiters (like '}') breaks syntax validation for linters and compilers.
**Action:** Move non-sensitive metadata to a dedicated section in README.md and ensure source files remain syntactically valid.
