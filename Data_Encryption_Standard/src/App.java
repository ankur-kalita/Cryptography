public class App {
    static void main() {
        DES des = new DES();
        String text = "Do you bleed ?";
        String encrypted = des.encrypt(text);
        System.out.println(encrypted);
        String decrypted = des.decrypt(encrypted);
        System.out.println(decrypted);
    }
}
