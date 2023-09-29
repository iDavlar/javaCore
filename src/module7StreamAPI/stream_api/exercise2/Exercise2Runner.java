package module7StreamAPI.stream_api.exercise2;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2Runner {

    public static final double CENTIMETRES_PER_INCH = 2.54;

    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            col.add(random.nextInt(20) + 1);
        }
        System.out.println(col);

        col.stream().forEach(n -> System.out.println(n.toString() + " inches"));

        col.stream().map(n -> n * CENTIMETRES_PER_INCH)
                .forEach(n -> System.out.println(n.toString() + " centimetres")
                );

        System.out.println(col.stream().map(n -> n * CENTIMETRES_PER_INCH)
                .reduce((n1, n2) -> n1 + n2).get());
    }
}
