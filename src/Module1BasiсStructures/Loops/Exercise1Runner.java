package Module1BasiсStructures.Loops;

import java.util.Scanner;

public class Exercise1Runner {
    public static void main(String[] args) {
        System.out.print("Введите значение факториала: ");
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        System.out.println("Факториал = " + getFactorial(factorial));
    }

    public static long getFactorial(int number) {
        if (number > 20){
            return 0L;
        }
        int i = number;
        long factorialSum = 1;
        while (i > 0) {
            factorialSum *= i;
            i--;
        }
        return factorialSum;
    }
}
