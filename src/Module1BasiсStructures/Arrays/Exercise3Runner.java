package Module1BasiсStructures.Arrays;

import java.util.Arrays;

public class Exercise3Runner {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (((i <= j) && (j < array.length - i)) || ((i >= j) && (i >= array.length - j - 1))) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
