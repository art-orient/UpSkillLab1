package Algorithmization.ArraysOfArrays;

import java.util.Arrays;
// 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task4 {
    public static int[][] formMatrix (int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = n - j;
                }
            }
        }
        return array;
    }
}