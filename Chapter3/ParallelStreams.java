package Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {

    public static void main(String[] args) {
        String[] wordArr = {"hello", "apple", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordArr));

        List<String> processedWords = words
                .parallelStream()
                .map(word -> {
                    System.out.println("Processing " + word);
                    return word.toUpperCase();
                })
                .map(word -> {
                    System.out.println("Adding exclamation point to " + word);
                    return word + "!";
                })
                .collect(Collectors.toList());

        System.out.println(processedWords);
    }

}
