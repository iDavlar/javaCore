package module7StreamAPI.stream_api.exercise1;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1Runner {
    public static void main(String[] args) {
        Collection<String> col = List.of(
                "Test",
                "login    ",
                "the longest string",
                "the shortest",
                "word",
                "no word",
                "another.one",
                "no word login",
                "TheWord"
        );

        System.out.println(col.stream().anyMatch(s -> s.matches(".*login.*")));

        System.out.println(col.stream().mapToInt(s -> s.length()).max().getAsInt());
        System.out.println(
                col.stream()
                        .sorted(Comparator.comparingInt(String::length))
                        .skip(col.size() - 1)
                        .findFirst().get()
        );

        System.out.println(col.stream().mapToInt(s -> s.length()).min().getAsInt());
        System.out.println(
                col.stream()
                        .sorted(Comparator.comparingInt(String::length))
                        .findFirst().get()
        );

        System.out.println(col.stream().filter(s -> !s.matches(".*[\\s\\.?!,].*")).collect(Collectors.toList()));

        System.out.println(col.stream().mapMulti((s, consumer) -> {
            for (String word : s.split("[\\s\\.?!,]+")) {
                consumer.accept(word);
            }
        }).collect(Collectors.toList()));

    }
}
