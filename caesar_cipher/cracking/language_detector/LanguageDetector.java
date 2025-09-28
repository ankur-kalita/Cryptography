package cracking.language_detector;

import java.util.List;

public class LanguageDetector {

    private FileProcessor fileProcessor;
    private List<String> englishWords;

    public LanguageDetector() {
        this.fileProcessor = new FileProcessor();
        this.englishWords = fileProcessor.getWords();
    }

    private int countEnglishWordsInText(String text) {
        text = text.toUpperCase();

        String[] words = text.split(" ");
        int matches = 0;

        for(String s : words)
            if(englishWords.contains(s))
                matches++;

        return matches;
    }

    public boolean isEnglish(String text) {
        int matches = countEnglishWordsInText(text);

        if ((float) matches / text.split(" ").length * 100 >= 60)
            return true;

        return false;
    }
}
