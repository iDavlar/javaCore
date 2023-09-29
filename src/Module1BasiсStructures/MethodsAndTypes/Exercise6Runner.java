package Module1BasiсStructures.MethodsAndTypes;

import java.util.Scanner;

public class Exercise6Runner {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(getThirdDigit(number));
    }

    public static byte getThirdDigit(int number){

        return (byte) (number / 100 % 10);

    }
}
