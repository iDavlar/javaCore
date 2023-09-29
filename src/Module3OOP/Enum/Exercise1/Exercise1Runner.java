package Module3OOP.Enum.Exercise1;

import java.util.Scanner;

public class Exercise1Runner {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season);
        }

        Season currentSeason;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter season name: ");
                currentSeason = Season.valueOf(scanner.next().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("There is no season with that name");
            }
        }

        System.out.printf("Next season after %s is %s",
                currentSeason.name(),
                nextSeason(currentSeason).name()
        );
    }

    public static Season nextSeason(Season currentSeason) {
        int curIndex = currentSeason.ordinal();
        Season[] seasons = Season.values();
        return seasons[(curIndex + 1 == seasons.length) ? 0 : curIndex + 1];
    }
}
