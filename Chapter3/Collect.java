package Chapter3;

import java.util.*;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "functional", "programming", "is", "cool", "apple"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        List<String> longWordsList = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.toList());
        System.out.println(longWordsList);

        Set<String> longWordsSet = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.toSet());
        System.out.println(longWordsSet);

        String longWordsString = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.joining(", "));
        System.out.println(longWordsString);

        Long longWordsCount = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.counting());
        System.out.println(longWordsCount);

        Map<Integer, List<String>> longWordsGroup = words
                .stream()
                .collect(Collectors.groupingBy(
                        (word) -> word.length()
                ));
        System.out.println(longWordsGroup);

        Map<Boolean, List<String>> longWordsPartition = words
                .stream()
                .collect(Collectors.partitioningBy(
                        (word) -> word.length() > 5
                ));
        System.out.println(longWordsPartition);

    }

}
