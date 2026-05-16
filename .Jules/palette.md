## 2024-05-16 - [Metadata Hygiene in Code Files]
**Learning:** In repositories where metadata is stored directly in code or config files, trailing data often breaks file validity (e.g., non-commented addresses in Java or trailing strings in JSON). Moving this metadata to a centralized README or using language-appropriate comments preserves both the data and the utility of the files.
**Action:** When encountering metadata appended to files, prefer moving it to the README or wrapping it in comments (for code) to maintain file validity while keeping the information accessible.
