package Module1BasiсStructures.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise5Runner {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println("Массив 1:");
        System.out.println(Arrays.toString(array));
        array = deleteLocalHighs(array);

        System.out.println(Arrays.toString(array));

        System.out.println("Массив 2:");
        int[] array1 = {5, 3, -10, 4, -4, 80, 20};
        System.out.println(Arrays.toString(array1));
        array1 = deleteLocalHighs(array1);

        System.out.println(Arrays.toString(array1));
    }

    private static int[] deleteLocalHighs(int[] array) {
        boolean[] localHighsMap = new boolean[array.length];
        int commonItemsCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (isLocalHigh(array, i)) {
                localHighsMap[i] = true;
            } else {
                commonItemsCount++;
            }
        }

        int[] result = new int[commonItemsCount];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (localHighsMap[i]) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    private static boolean isLocalHigh(int[] array, int i) {
        boolean result = false;

        if (i == 0) {
            result = array[i] > array[i + 1];
        } else if (i == array.length - 1) {
            result = array[i] > array[i - 1];
        } else {
            result = array[i - 1] < array[i] && array[i] > array[i + 1];
        }

        return result;
    }
}
