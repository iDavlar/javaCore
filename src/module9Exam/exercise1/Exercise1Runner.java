package module9Exam.exercise1;

import java.util.Random;

public class Exercise1Runner {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        int z = random.nextInt(100);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        if (x > z) {
            System.out.println(x + z);
        } else if (z > y) {
            System.out.println((x + y + z) / 3.0);
        } else {
            System.out.println(y % z);
        }
    }
}
