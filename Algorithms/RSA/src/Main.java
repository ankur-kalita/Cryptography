import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String message = "You are not brave! Man are brave.";
        RSA rsa = new RSA();
        rsa.generateKeys(1024);
        BigInteger cipherText = rsa.encryptMessage(message);
        System.out.println("Encrypted: " + cipherText);
        String decryptedMessage = rsa.decryptMessage(cipherText);
        System.out.println("Decrypted: " + decryptedMessage);
    }
}