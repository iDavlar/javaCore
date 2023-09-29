package Module1BasiсStructures.IfElse;

import java.util.Scanner;

public class Exercise2Runner {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        float a = scanner.nextInt();

        System.out.print("b = ");
        float b = scanner.nextInt();

        System.out.print("r = ");
        float r = scanner.nextFloat();

        if (rectangleIsSuitableToCircle(a, b, r)) {
            System.out.println("Можно закрыть");
        } else {
            System.out.println("Нельзя закрыть");
        }

    }

    public static boolean rectangleIsSuitableToCircle(float a, float b, float r) {
        return Math.hypot(a, b) >= r * 2;
    }
}
