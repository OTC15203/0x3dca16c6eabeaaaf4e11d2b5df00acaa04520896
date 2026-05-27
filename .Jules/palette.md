## 2025-05-15 - Repository Hygiene as Developer Experience (DX)
**Learning:** In repositories without a traditional web UI, the "interface" is defined by the file structure, documentation (README), and data formatting. Clear naming and clean files significantly improve the accessibility and intuitiveness for developers.
**Action:** Prioritize descriptive filenames, provide a helpful README with metadata visibility, and ensure data files (JSON, Code) are valid and free of non-standard trailing content.

## 2025-05-15 - Excluding Build Artifacts
**Learning:** Compiling code during verification can generate artifacts (e.g., .class files) that should not be committed to the repository, even if a .gitignore is added.
**Action:** Always manually ensure that no build-generated files are staged for commit, and use .gitignore to prevent future accidental inclusions.
