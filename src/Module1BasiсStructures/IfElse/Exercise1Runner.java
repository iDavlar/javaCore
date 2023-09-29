package Module1BasiсStructures.IfElse;

import java.util.Scanner;

public class Exercise1Runner {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isLastDigit7(number));
    }

    public static boolean isLastDigit7(int number) {
        return getLastDigit(number) == 7;
    }

    public static int getLastDigit(int number) {
        return (number % 10);
    }
}
