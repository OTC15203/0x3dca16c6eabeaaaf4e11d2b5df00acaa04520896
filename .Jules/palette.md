## 2026-06-04 - Metadata Sanitization and DX Improvement
**Learning:** Appending metadata strings (ETH addresses, hashes) to the end of source files (JSON, Java) after the final delimiter breaks toolchain support (linters, compilers, syntax highlighters). This creates a poor Developer Experience (DX) and makes the code functionally "corrupt" for standard tools.
**Action:** Always separate project metadata from functional source code. Use a dedicated `Metadata` section in the `README.md` for non-sensitive info and ensure source files are strictly valid per their format.
