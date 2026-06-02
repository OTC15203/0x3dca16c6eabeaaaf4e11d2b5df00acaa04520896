## 2025-05-14 - [DX as UX in Code-Only Repositories]
**Learning:** In repositories without a traditional frontend, the "interface" is defined by the file structure, naming conventions, and the validity of source files. Malformed files with trailing metadata break developer tools (compilers, linters) and represent a significant UX barrier.
**Action:** Prioritize descriptive file naming and ensure all source/config files are syntactically valid by relocating appended metadata to a structured README.md.
