//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AES ase = new AES();

        String text = "You are not brave, Man are brave !";
        String cipherText = ase.encrypt(text);
        System.out.println("Encrypted: " + cipherText);
        String decrypted = ase.decrypt(cipherText);
        System.out.println("Decrypted: " + decrypted);
    }
}