## 2026-06-09 - Improving DX through metadata sanitization
**Learning:** In a repository without a traditional UI, the "interface" consists of the file structure, documentation, and data formatting. Appending metadata directly to source files (like JSON or Java) breaks developer tools (linters, compilers) and degrades the Developer Experience (DX).
**Action:** Move non-sensitive metadata to a structured section in the README.md and ensure all source files adhere to their respective syntax standards.
