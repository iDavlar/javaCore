package Module1BasiсStructures.MethodsAndTypes;

import java.util.Scanner;

public class Exercise5Runner {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        short number = sc.nextShort();
        System.out.println(getSum(number));
    }

    public static short getSum(short abcd){

        byte ab = (byte) (abcd / 100);
        byte cd = (byte) (abcd % 100);

        return (short) (ab + cd);

    }
}
