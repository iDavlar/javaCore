package module7StreamAPI.stream_api.exercise4;


import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise4Runner {
    public static void main(String[] args) {
        int minValue = 1;
        int maxValue = 11;
        int listLength = 100;

        Set<String> set = new Random()
                .ints(listLength, minValue, maxValue)
                .boxed()
                .filter(n -> n % 2 == 0)
                .map(n -> n.toString())
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
