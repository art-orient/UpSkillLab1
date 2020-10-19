package Algorithmization.ArraysOfArrays;

import java.util.Arrays;
// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void printLineK_AndColumnP (int[][] array, int k, int p) {
        System.out.println("Строка " + k + " - " + Arrays.toString(array[k-1]));
        String columnP = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j + 1 == p) {
                    columnP += array[i][j] + " ";
                }
            }
        }
        System.out.println("Столбец " + p + " - " + columnP);
    }
}