package Algorithmization.ArraysOfArrays;

import java.util.Arrays;

// 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task1 {
    public static void printTask1 (int[][] array) {
        for (int i = 0; i < array[0].length; i+=2) {
            if (array[0][i] > array[array.length-1][i]) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
