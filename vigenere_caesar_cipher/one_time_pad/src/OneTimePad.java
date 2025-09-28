public class OneTimePad {
    public String encrypt(String plainText, int[] key) {
        plainText = plainText.toUpperCase();
        String cipherText = "";
        for(int i = 0; i < plainText.length(); i++) {
            int keyIndex = key[i];
            int characterIndex = Constants.ALPHABET.indexOf(plainText.charAt(i));
            cipherText += Constants.ALPHABET.charAt(Math.floorMod(characterIndex + keyIndex, Constants.ALPHABET.length()));
        }
        return cipherText;
    }
    public String decrypt(String cipherText, int[] key) {
        cipherText = cipherText.toUpperCase();
        String plainText = "";
        for(int i = 0; i < cipherText.length(); i++) {
            int keyIndex = key[i];
            int characterIndex = Constants.ALPHABET.indexOf(cipherText.charAt(i));
            plainText += Constants.ALPHABET.charAt(Math.floorMod(characterIndex - keyIndex, Constants.ALPHABET.length()));
        }
        return plainText;
    }
}
