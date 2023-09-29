package Module1BasiсStructures.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise1Runner {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Четные элементы");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
