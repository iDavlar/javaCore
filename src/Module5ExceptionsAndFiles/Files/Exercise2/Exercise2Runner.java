package Module5ExceptionsAndFiles.Files.Exercise2;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2Runner {
    public static void main(String[] args) {

        int wordCount = 0;
        int punctuationCount = 0;

        File file = new File("text.txt");
        try {
            if (!file.exists())
                file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fw = new FileWriter(file, false)) {
            fw.write(
                    "Hello, how are you?\n"
                            + "I`m fine! Thank you!"
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fr = new FileReader(file);
             Scanner sc = new Scanner(fr)) {
            Pattern pattern = Pattern.compile("[.,!?`=()\\-+]");

            System.out.println("The text:");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    punctuationCount++;
                }
                wordCount += line.split("[\\s]+").length;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("Punctuation: " + punctuationCount);
        System.out.println("Words: " + wordCount);
    }
}
