package module7StreamAPI.stream_api.exercise3;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise3Runner {
    public static void main(String[] args) {
        int minValue = 20;
        int maxValue = 100;
        int listLength = 119;

        List<Integer> list = new Random()
                .ints(listLength, minValue, maxValue)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);

        System.out.println(list.stream().anyMatch(n -> (n % 3 == 0) && (n % 5 == 0)));
        System.out.println(list.stream().filter(n -> (n % 3 == 0) && (n % 5 == 0))
                .collect(Collectors.toList()));
    }
}
