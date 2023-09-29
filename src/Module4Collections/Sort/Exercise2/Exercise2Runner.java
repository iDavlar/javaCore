package Module4Collections.Sort.Exercise2;


import java.util.*;
import java.util.stream.Collectors;

public class Exercise2Runner {
    public static void main(String[] args) {
        Map<String, Integer> nonSortedMap = Map.of(
                "two", 2,
                "five", 5,
                "three", 3,
                "one", 1,
                "four", 4
        );

        System.out.println("Unsorted map: " + nonSortedMap);
        Map<String, Integer> sortedMap = sortByValue(nonSortedMap);

        System.out.println("Sorted map: " + sortedMap);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> nonSortedMap) {
        EntryValueComparator<String, Integer> comparator = new EntryValueComparator<>(nonSortedMap);
        Map<String, Integer> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(nonSortedMap);

        return sortedMap;
    }
}
