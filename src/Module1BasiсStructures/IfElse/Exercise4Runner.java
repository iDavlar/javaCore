package Module1BasiсStructures.IfElse;

import java.util.Scanner;

public class Exercise4Runner {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму: ");
        int sum = scanner.nextInt();

        showFormattedSum(sum);
    }

    private static void showFormattedSum(int sum) {
        System.out.printf("У вас %d %s", sum, getEnding(sum));
        System.out.println();
    }

    private static String getEnding(int sum) {
        String ending;

        int lastDigit = sum % 10;
        int lastToDigits = sum % 100;
        if (lastDigit == 1 && lastToDigits != 11) {
            ending = "рубль";
        } else if (lastDigit > 1 && lastDigit < 5 && (lastToDigits < 12 || lastToDigits > 15)) {
            ending = "рубля";
        } else {
            ending = "рублей";
        }
        return ending;
    }
}
