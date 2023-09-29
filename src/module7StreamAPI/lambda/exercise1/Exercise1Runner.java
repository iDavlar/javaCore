package module7StreamAPI.lambda.exercise1;

import java.nio.file.DirectoryStream;
import java.util.function.Predicate;

public class Exercise1Runner {
    public static void main(String[] args) {
        String test = null;

        Predicate<String> predicate = t -> t != null;
        System.out.println("Is it not null? " + predicate.test(test));

        predicate = t -> t != null && t.length() > 0;
        test = "test";
        System.out.println("Is it not empty? " + predicate.test(test));

        predicate = t -> {
            String temp = t.toLowerCase();
            return ((temp.startsWith("j") || temp.startsWith("n")) && temp.endsWith("a"));
        };
        test = "test";
        System.out.println("Is it validate? " + predicate.test(test));
        test = "java";
        System.out.println("Is it validate? " + predicate.test(test));
    }
}
