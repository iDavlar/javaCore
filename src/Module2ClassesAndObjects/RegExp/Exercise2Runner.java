package Module2ClassesAndObjects.RegExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2Runner {
    public static void main(String[] args) {
        System.out.print("Enter text: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Text contains " + countWords(text) + " words");
    }

    private static int countWords(String text) {
        return text.trim().split("\\s+").length;
    }

}
