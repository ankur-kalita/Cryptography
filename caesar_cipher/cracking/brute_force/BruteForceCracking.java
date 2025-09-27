package cracking.brute_force;

public class BruteForceCracking {

    private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public void crack(String cipherText) {
        for(int key = 0; key < ALPHABET.length(); key++) {
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
            System.out.println("Key " + key + ": " + plainText);
        }
    }
}
