package Module2ClassesAndObjects.Strings;

public class Exercise2Runner {
    public static void main(String[] args) {
        String str = "aaabbbccc";

        long startTime = System.nanoTime();
        String result1 = str;
        for (int i = 0; i < 100_000; i++) {
            result1 += str;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения конкатенации: " + elapsedTime / 1000000);

        startTime = System.nanoTime();
        StringBuilder result2 = new StringBuilder(str);
        for (int i = 0; i < 100_000; i++) {
            result2.append(str);
        }
        result2.toString();
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения StringBuilder: " + elapsedTime / 1000000);
    }
}
