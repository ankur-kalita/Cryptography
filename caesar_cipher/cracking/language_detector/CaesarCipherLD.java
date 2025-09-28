package cracking.language_detector;

public class CaesarCipherLD {

    private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private LanguageDetector languageDetector;

    public CaesarCipherLD() {
        this.languageDetector = new LanguageDetector();
    }

    public void crack(String cipherText) {


        for (int key = 0; key < ALPHABET.length(); ++key) {

            String plainText = "";

            for (int i = 0; i < cipherText.length(); ++i) {
                char character = cipherText.charAt(i);
                int charIndex = ALPHABET.indexOf(character);
                int decryptedIndex = Math.floorMod(charIndex - key, ALPHABET.length());
                plainText += ALPHABET.charAt(decryptedIndex);
            }

            if (languageDetector.isEnglish(plainText))
                System.out.format("Caesar-cipher with %s key the result is: %s%n",
                        key, plainText);
        }
    }
}