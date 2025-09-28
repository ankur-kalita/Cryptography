package making;

public class Main {
    public static void main(String[] args) {
        VigenereCipher vc = new VigenereCipher();
        String text = "I want to tear you down";
        String key = "Thirst";
        String encrypted = vc.encrypt(text, key);
        System.out.println("Encrypted: " + encrypted);
        String decrypted = vc.decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }
}