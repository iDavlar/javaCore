package module7StreamAPI.stream_api.exercise6;


import java.util.stream.IntStream;

public class Exercise6Runner {
    public static void main(String[] args) {
        test(4);
        test(10);
        test(12);
        test(13);
        test(23);
        test(24);
        test(30);
        test(40);
        test(60);
        test(100);
    }

    public static void test(int number) {
        System.out.printf("for %d return %s (def %s)",
                number,
                getFirst(number),
                getFirstDef(number)
        );
        System.out.println();
    }

    public static Integer getFirst(int n) {
        return IntStream.range(0, n)
                .filter(i -> i * 2 <= n)
                .filter(i -> i % 2 == 0)
                .filter(i -> i > 10)
                .boxed()
                .findFirst().orElse(null);
    }

    public static Integer getFirstDef(int n) {

        for (int i = 2; 2 * i <= n; i += 2) {
            if (i > 10) {
                return i;
            }

        }

        return null;
    }


}
