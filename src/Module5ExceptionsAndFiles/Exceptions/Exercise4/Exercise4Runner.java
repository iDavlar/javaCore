package Module5ExceptionsAndFiles.Exceptions.Exercise4;

import Module5ExceptionsAndFiles.Exceptions.Exercise3.NoBrainUserException;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4Runner {
    public static void main(String[] args) {
        showDivide("1", "2", "3");
        showDivide("1", "0");
        showDivide();
        showDivide("1", "2.0", "3");
        showDivide("1", "2.1", "3");
    }

    private static void showDivide(String... arguments) {
        double result = 0.0;
        try {
            System.out.println("Division of " + Arrays.toString(arguments) + ":");
            result = Division.divide(arguments);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Result: " + result);
        }

    }
}
