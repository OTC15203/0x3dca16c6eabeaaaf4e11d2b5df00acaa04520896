# Cryptography and Strike OIDC Configuration

This repository contains cryptographic utilities and OpenID Connect (OIDC) discovery information for Strike.

## Contents

- `EncryptionExample.java`: A Java implementation of AES encryption and decryption.
- `Payment`: Strike OIDC discovery document and associated metadata.

## Metadata

### Ethereum Addresses
- `0xed03Ed872159e199065401b6d0D487d78d9464AA` (associated with EncryptionExample)
- `0x54147F75e849903E0AA08AE8fa619bC229a7751C` (associated with Payment)

## Usage

### Java Encryption Example
To compile and run the encryption example:
```bash
javac EncryptionExample.java
java EncryptionExample
```

### Strike OIDC
The `Payment` file contains the OIDC configuration for `https://auth.strike.me`.
