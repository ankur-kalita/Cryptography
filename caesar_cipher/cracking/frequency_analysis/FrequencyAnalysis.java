package cracking.frequency_analysis;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {
    private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    Map<Character, Integer> run (String text) {
        text = text.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if(ALPHABET.indexOf(c) != -1) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        return map;
    }

    public void showFrequency(String text) {
        Map<Character, Integer> map = run(text);

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
