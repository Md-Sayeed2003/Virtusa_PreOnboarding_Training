package Day5.Task3;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "java is powerful and java is fast";
        String[] words = sentence.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Words with frequency > 1:");
        wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}

