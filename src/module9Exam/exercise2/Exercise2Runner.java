package module9Exam.exercise2;

import java.util.Arrays;
import java.util.Random;

public class Exercise2Runner {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = random.ints(-300, 301)
                .limit(10).toArray();

        System.out.println(Arrays.toString(array));

        int max = Arrays.stream(array).max().orElse(0);
        System.out.println("max = " + max);

        int min = Arrays.stream(array).min().orElse(0);
        System.out.println("min = " + min);

        System.out.println(Arrays.toString(Arrays.stream(array)
                .map(i -> {
                    if (i == max) {
                        return min;
                    } else if (i == min) {
                        return max;
                    } else {
                        return i;
                    }
                })
                .toArray()));
    }
}
