package Module5ExceptionsAndFiles.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise1Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = sc.nextInt();

        System.out.println("Days:");

        LocalDate date = LocalDate.of(LocalDate.now().getYear(), monthNumber, 1);
        do {
            System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM:uuuu")));
            date = date.plusDays(1);
        } while (monthNumber == date.getMonth().getValue());


    }
}
