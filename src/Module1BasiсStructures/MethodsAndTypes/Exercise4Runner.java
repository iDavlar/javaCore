package Module1BasiсStructures.MethodsAndTypes;

import java.util.Scanner;

public class Exercise4Runner {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Last digit is " + detLastDigit(number));

    }

    public static byte detLastDigit(int number) {

        return (byte) (number % 10);
    }
}
