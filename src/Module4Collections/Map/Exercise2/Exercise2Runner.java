package Module4Collections.Map.Exercise2;


import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Exercise2Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] words = text.split("[\\s,.!?\\-~]+");
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.put(word.toLowerCase(),
                    wordsCount.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        System.out.println(wordsCount);
    }

}
