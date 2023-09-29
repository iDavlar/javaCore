package Module5ExceptionsAndFiles.Exceptions.Exercise5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private int upperBoundary = 100;
    private int guessCount = 0;
    private int guessedNumber = 0;

    private int usersNumber = 0;

    public GuessNumberGame() {

    }

    public GuessNumberGame(int upperBoundary) {
        this.upperBoundary = upperBoundary;
    }

    public void play() {
        showIntro();
        generateNumber();
        do {
            askUsersNumber();
        } while (checkAnswer());
        showResult();
    }

    private void showResult() {
        System.out.println("Game is over!");
        System.out.println("The computer guessed: " + guessedNumber);
        System.out.println("You guessed on " + guessCount + " tries!");
        System.out.println("Good bye!");
    }

    private boolean checkAnswer() {
        if (usersNumber == guessedNumber) {
            System.out.println("You are right!");
        } else if (usersNumber > guessedNumber) {
            System.out.println("I guessed a lower number!");
        } else if (usersNumber < guessedNumber) {
            System.out.println("I guessed a higher number!");
        }
        return usersNumber != guessedNumber;
    }

    private void askUsersNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a number: ");
                String answer = sc.next();
                usersNumber = Integer.parseInt(answer);
                if (usersNumber < 1 || usersNumber > upperBoundary) {
                    throw new IllegalArgumentException("The number must be between 1 and " + upperBoundary);
                }
                guessCount++;
                break;
            } catch (NumberFormatException e) {
                System.out.println("It is not a number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void generateNumber() {
        Random r = new Random();
        guessedNumber = r.nextInt(upperBoundary) + 1;
    }

    private void showIntro() {
        System.out.println("It is a guess number game!");
        System.out.println("You need to guess the number that the computer has guessed!");
        System.out.println("The number ranges from 1 to " + upperBoundary);
    }
}
