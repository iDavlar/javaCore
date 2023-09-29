package Module1BasiсStructures.Loops;

import java.util.Scanner;

public class Exercise2Runner {
    public static void main(String[] args) {
        long number = 7_893_823_445L;
        System.out.println(getDigitsSum(number));
    }

    public static long getDigitsSum(long number) {
        long result = 0;
        do {
            long lastDigit = number % 10;
            result += lastDigit;

            number /= 10;
        } while(number > 0);
        return result;
    }
}
