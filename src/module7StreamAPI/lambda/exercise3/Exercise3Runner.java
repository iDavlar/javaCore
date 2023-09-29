package module7StreamAPI.lambda.exercise3;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exercise3Runner {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(11);
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
