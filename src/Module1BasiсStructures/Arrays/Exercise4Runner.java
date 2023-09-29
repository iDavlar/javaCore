package Module1BasiсStructures.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise4Runner {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();
        int bound = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }
        System.out.println(Arrays.toString(array));

        changeEqualItems(array, bound);
        System.out.println(Arrays.toString(array));
    }

    private static void changeEqualItems(int[] array, int bound) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    int newValue = random.nextInt(bound);
                    while (valueIsInArray(array, newValue)){
                        newValue = random.nextInt(bound);
                    }
                    array[j] = newValue;
                }
            }
        }
    }

    private static boolean valueIsInArray(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
}
