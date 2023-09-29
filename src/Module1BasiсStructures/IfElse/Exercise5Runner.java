package Module1BasiсStructures.IfElse;

import java.util.Scanner;

public class Exercise5Runner {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        double a = enterNotZero(scanner, "a");

        System.out.print("b = ");
        double b = scanner.nextInt();

        System.out.print("c = ");
        double c = scanner.nextInt();

        findRoots(a, b, c);

    }

    private static void findRoots(double a, double b, double c) {
        double discriminant = getDiscriminant(a, b, c);
        if (discriminant < 0) {
            System.out.println("Нет корней");
        } else if (discriminant == 0) {
            showRoot(a, b);
        } else {
            showRootsByDiscriminant(a, b, discriminant);
        }

    }

    private static void showRootsByDiscriminant(double a, double b, double d) {
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.printf("У уравнения 2 корня: %.2f и %.2f", x1, x2);
    }

    private static void showRoot(double a, double b) {
        double x = (-b) / (2 * a);
        System.out.printf("У уравнения 1 корень %.2f", x);
    }

    private static double getDiscriminant(double a, double b, double c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    private static double enterNotZero(Scanner scanner, String a) {
        double result = 0;
        while (result == 0f) {
            System.out.printf("%s = ", a);
            result = scanner.nextDouble();
        }
        return result;
    }


}
