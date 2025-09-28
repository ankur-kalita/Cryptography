//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OneTimePad otp = new OneTimePad();
        RandomGenerator rg = new RandomGenerator();
        String text = "HELLO WORLD";
        int[] key = rg.generate(text.length());
        String encrypted = otp.encrypt(text, key);
        System.out.println("Encrypted: " + encrypted);
        String decrypted = otp.decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }
}