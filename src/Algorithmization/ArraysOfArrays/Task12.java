package Algorithmization.ArraysOfArrays;

import java.util.Arrays;

// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {
    public static int[][] sortUp(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        return array;
    }
    public static int[][] sortDown(int[][] array) {
        sortUp(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][array[0].length - 1 - j];
                array[i][array[0].length - 1 - j] = temp;
            }
        }
        return array;
    }

}
