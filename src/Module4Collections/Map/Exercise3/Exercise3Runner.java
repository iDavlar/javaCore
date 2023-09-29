package Module4Collections.Map.Exercise3;


import java.util.HashMap;
import java.util.Scanner;

public class Exercise3Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        char[] chars = text.toCharArray();
        HashMap<Character, Integer> charsCount = new HashMap<>();
        for (Character character : chars) {
            charsCount.put(character,
                    charsCount.getOrDefault(character, 0) + 1);
        }

        System.out.println(charsCount);
    }

}
