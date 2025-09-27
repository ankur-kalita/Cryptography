public class CaesarCipher {
    private String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private String encrypt(String plainText, int key) {
        String cipherText = "";
        plainText = plainText.toUpperCase();
        for(int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            int charIndex = ALPHABET.indexOf(ch);

        }
        return cipherText;
    }
    private String decrypt(String cipherText, int key) {

    }
}