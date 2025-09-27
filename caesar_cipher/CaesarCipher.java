public class CaesarCipher {
    public String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String plainText, int key) {
        String cipherText = "";
        plainText = plainText.toUpperCase();
        for(int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            int charIndex = ALPHABET.indexOf(ch);
            if (charIndex != -1) {
                int encryptedIndex = Math.floorMod(charIndex + key, ALPHABET.length());
                cipherText += ALPHABET.charAt(encryptedIndex);
            } else {
                cipherText += ch; 
            }
        }
        return cipherText;
    }
    public String decrypt(String cipherText, int key) {
        String plainText = "";
        for(int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            int charIndex = ALPHABET.indexOf(ch);
            if (charIndex != -1) {
                int decryptedIndex = Math.floorMod(charIndex - key, ALPHABET.length());
                plainText += ALPHABET.charAt(decryptedIndex);
            } else {
                plainText += ch; 
            }
        }
        return plainText;
    }
}