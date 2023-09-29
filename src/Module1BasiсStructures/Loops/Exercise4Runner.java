package Module1BasiсStructures.Loops;

import java.util.Scanner;

public class Exercise4Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество людей: ");
        int personCount = scanner.nextInt();

        System.out.print("Количество кусочков в пицце: ");
        int piecesCount = scanner.nextInt();

        System.out.printf("Вам понадобится %d пицц", determinePizzaCount(personCount, piecesCount));

    }

    public static int determinePizzaCount(int personCount, int piecesCount) {
        int pizzaCount = 1;
        do {
            int rest = (pizzaCount * piecesCount) % personCount;
            if (rest == 0) {
                break;
            } else {
                pizzaCount++;
            }
        } while (true);
        return pizzaCount;
    }
}
