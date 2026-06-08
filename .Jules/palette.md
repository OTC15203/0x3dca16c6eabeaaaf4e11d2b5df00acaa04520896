## 2026-06-04 - Improving Developer Experience (DX) via File Sanitization and Naming
**Learning:** Non-descriptive file names and invalid syntax (due to appended metadata) create significant friction for developers, as they break standard tooling (linters, compilers, JSON parsers) and obscure the project's purpose.
**Action:** Always ensure source files have descriptive names and valid syntax. Move non-functional metadata to the README or dedicated config files to preserve DX.
