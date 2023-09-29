package Module5ExceptionsAndFiles.Exceptions.Exercise2;

import java.util.Scanner;

public class Exercise2Runner {
    public static void main(String[] args) {
        try {
            checkUser();
        } catch (NoBrainUserException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Yes, you are right.");
        }
    }

    private static void checkUser() throws NoBrainUserException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is Earth flat?(y/n)");
        if (scanner.next().toLowerCase().equals("y")) {
            throw new NoBrainUserException("*giggle*");
        }
    }
}
