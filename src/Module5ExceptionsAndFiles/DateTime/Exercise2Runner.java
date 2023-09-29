package Module5ExceptionsAndFiles.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TimeZone;

public class Exercise2Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days from the date: ");
        int dayNumber = sc.nextInt();

        System.out.print("The date is: " + LocalDateTime.now(ZoneId.of("Asia/Yerevan"))
                .minusDays(dayNumber)
                .format(DateTimeFormatter.ofPattern("dd MMMM uuuu HH:mm")));

    }
}
