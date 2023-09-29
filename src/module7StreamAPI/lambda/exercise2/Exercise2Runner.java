package module7StreamAPI.lambda.exercise2;

import java.util.function.Function;
import java.util.function.Predicate;

public class Exercise2Runner {
    public static void main(String[] args) {

        Function<Integer, String> function = number -> {
            String result = "Zero";
            if (number < 0) {
                result = "Negative number";
            } else if (number > 0) {
                result = "Positive number";
            }
            return result;
        };

        System.out.println(function.apply(-1));
        System.out.println(function.apply(0));
        System.out.println(function.apply(1));
    }
}
