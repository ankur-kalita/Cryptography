import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class AES {

    private SecretKey secretKey;
    private SecureRandom random;
    private Cipher encryptCipher;
    private Cipher decryptCipher;
    private IvParameterSpec ivParameterSpec;

    public AES() {
        random = new SecureRandom();
        try {
            secretKey = KeyGenerator.getInstance("AES").generateKey();
            encryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            decryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] initializationVector = new byte[encryptCipher.getBlockSize()];
            random.nextBytes(initializationVector);
            ivParameterSpec = new IvParameterSpec(initializationVector);
            encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
            decryptCipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (NoSuchPaddingException e) {
            throw new RuntimeException(e);
        } catch (InvalidAlgorithmParameterException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    public String encrypt(String plainText) {
        byte[] bytes = plainText.getBytes();
        byte[] cipherText = null;

        try {
            cipherText = encryptCipher.doFinal(bytes);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        }
        return Base64.getEncoder().encodeToString(cipherText);
    }

    public String decrypt(String cipherText) {
        byte[] plainText = null;

        try {
            plainText = decryptCipher.doFinal(Base64.getDecoder().decode(cipherText.getBytes()));
            return new String(plainText, "UTF8");
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
