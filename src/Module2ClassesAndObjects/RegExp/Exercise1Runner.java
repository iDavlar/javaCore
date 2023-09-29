package Module2ClassesAndObjects.RegExp;

import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1Runner {
    public static void main(String[] args) {
        System.out.print("Enter text: ");
        String text = new Scanner(System.in).nextLine();
        findPunctuation(text);
    }

    private static void findPunctuation(String text) {
        Pattern pattern = Pattern.compile("[,.!?]");
        Matcher matcher = pattern.matcher(text);
        int groupCount = 0;
        while (matcher.find()) {
            System.out.println(matcher.group() + " at " + matcher.start() + " - " + matcher.end());
            groupCount++;
        }

        System.out.println("Total: " + matcher.groupCount()); // It is not working for some reason
        System.out.println("Total: " + groupCount);

    }


}
