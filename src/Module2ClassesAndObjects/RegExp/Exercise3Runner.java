package Module2ClassesAndObjects.RegExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3Runner {
    public static void main(String[] args) {
        System.out.print("Enter text: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("The word is " + madeWordOfLastCharacters(text));
    }

    private static String madeWordOfLastCharacters(String text) {
        Pattern pattern = Pattern.compile("[\\w](?=\\W)");
        Matcher matcher = pattern.matcher(text);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
        }
        return stringBuilder.toString();
    }

}
