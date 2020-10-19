package Algorithmization.ArraysOfArrays;

import java.util.Arrays;
// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void printLineK_AndColumnP (int[][] array, int k, int p) {
        System.out.println("Строка " + k + " - " + Arrays.toString(array[k-1]));
        StringBuilder columnP = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                    columnP = columnP.append(array[i][p-1] + " ");
            }
        System.out.println("Столбец " + p + " - " + columnP.toString());
    }
}