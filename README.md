# Strike OIDC Configuration and Encryption Utility

This repository contains a discovery document for Strike OIDC and a Java utility for AES encryption.

## Files

- `strike_config.json`: Strike OIDC discovery document (sanitized and formatted).
- `EncryptionExample.java`: A simple Java class demonstrating AES encryption and decryption.

## Verification

### JSON Validation
To verify the validity of `strike_config.json`, run:
```bash
python3 -m json.tool strike_config.json
```

### Java Compilation
To verify the `EncryptionExample.java` source, run:
```bash
javac EncryptionExample.java
```

## Metadata

| Description | Value |
|-------------|-------|
| Root Project | `0x3dca16c6eabeaaaf4e11d2b5df00acaa04520896` |
| Payment Metadata Hash | `f09cc3469569b187ccc5fabe65847f6e2fb54aa7910aa40d5fa909a834159fa2` |
| Payment Metadata | `0x54147F75e849903E0AA08AE8fa619bC229a7751C` |
| Encryption Metadata | `0xed03Ed872159e199065401b6d0D487d78d9464AA` |
