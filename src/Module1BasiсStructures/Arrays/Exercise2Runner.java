package Module1BasiсStructures.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise2Runner {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        findIndexOfMaxItem(array);
    }

    private static void findIndexOfMaxItem(int[] array) {
        if (array.length == 0) {
            System.out.println("Пустой массив");
        } else if (array.length == 1) {
            showAnswer(array[0], 0);
        } else {
            int maxItem = array[0];
            int maxIndex = 0;
            for (int i = 1; i < array.length; i++) {
                if (maxItem < array[i]) {
                    maxItem = array[i];
                    maxIndex = i;
                }
            }
            showAnswer(maxItem, maxIndex);
        }

    }

    private static void showAnswer(int value, int index) {
        System.out.println("Максимальный элемент " + value + " с индексом " + index);
    }

}
