package cracking.frequency_analysis;

import making.CaesarCipher;

import java.util.Map;

public class CrackCaesar {
    private FrequencyAnalysis frequencyAnalysis;

    public CrackCaesar() {
        frequencyAnalysis = new FrequencyAnalysis();
    }

    public void crack(String cipherText) {
        Map<Character, Integer> freqMap = frequencyAnalysis.run(cipherText);
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        char mostFrequentChar = maxEntry.getKey();
        int approxKey = Constants.ALPHABET.indexOf(mostFrequentChar) - Constants.ALPHABET.indexOf('A');
        System.out.println("Approximate Key: " + approxKey);
    }
}
