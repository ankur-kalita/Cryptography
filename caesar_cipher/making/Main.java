package making;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        // dynamic input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to encrypt: ");
        String text = scanner.nextLine();
        int key = 3;
        String encrypted = cc.encrypt(text, key);
        System.out.println("Encrypted: " + encrypted);
        String decrypted = cc.decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }
}