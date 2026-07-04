import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionExample {

    public static void main(String[] args) {
        String message = "YourSecretMessage";
        String secretKey = "YourSecretKey123";

        try {
            String encryptedMessage = encrypt(message, secretKey);
            System.out.println("✅ Encrypted: " + encryptedMessage);

            String decryptedMessage = decrypt(encryptedMessage, secretKey);
            System.out.println("🔓 Decrypted: " + decryptedMessage);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String encrypt(String message, String secretKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedMessage, String secretKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
}
