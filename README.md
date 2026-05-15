# 🎨 Cryptographic Utilities & Payment Configurations

This repository contains cryptographic utilities and configurations for payment integration.

## 📁 Repository Structure

- **`EncryptionExample.java`**: A Java utility for AES encryption and decryption.
- **`payment-config.json`**: OpenID Connect (OIDC) discovery configuration for [Strike](https://strike.me).
- **`.Jules/palette.md`**: UX strategy and learning journal for this repository.

## 🔐 Cryptographic Identifiers & Metadata

- **Repository Fingerprint**: `0x3dca16c6eabeaaaf4e11d2b5df00acaa04520896`
- **Mexican Peso Tether (MXN₮)**: [0xed03Ed872159e199065401b6d0D487d78d9464AA](https://etherscan.io/token/0xed03ed872159e199065401b6d0d487d78d9464aa)
- **Additional Ethereum Address**: `0x54147F75e849903E0AA08AE8fa619bC229a7751C`
- **SHA-256 Config Hash**: `f09cc3469569b187ccc5fabe65847f6e2fb54aa7910aa40d5fa909a834159fa2`
- **WalletConnect URI**: `wc:cea1edc86d7fd575fac75a1976f35bef3065c529529e495f6eb276c1e8330f55@2?relay-protocol=irn&symKey=1deeadb9f96b2f2b41ceacca7d499167a4d4c9aae9a60445486be89ef9ba2d78`

## 🚀 Usage

### Java Encryption
The encryption utility can be compiled and run using standard Java tools:
```bash
javac EncryptionExample.java
java EncryptionExample
```

### OIDC Configuration
The OIDC discovery document in `payment-config.json` provides the necessary endpoints for integrating with the Strike authentication service.
