import java.util.*;

public class Ex9_2 {
    public static void main(String[] args) {
        String text = "Java is a programming language. Java is widely used.";
        String[] words = text.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(text.replace(mostFrequentWord, "*"));
    }
}
