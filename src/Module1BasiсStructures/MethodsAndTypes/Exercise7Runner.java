package Module1BasiсStructures.MethodsAndTypes;

import java.util.Scanner;

public class Exercise7Runner {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("x1 = ");
        int x1 = sc.nextInt();

        System.out.print("y1 = ");
        int y1 = sc.nextInt();

        System.out.print("x2 = ");
        int x2 = sc.nextInt();

        System.out.print("y2 = ");
        int y2 = sc.nextInt();

        System.out.println(getLength(x1,y1,x2,y2));
    }

    public static double getLength(int x1, int y1, int x2, int y2){

        return Math.hypot(x2 - x1, y2 - y1);

    }
}
