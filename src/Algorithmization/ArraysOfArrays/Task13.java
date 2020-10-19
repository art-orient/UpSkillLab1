package Algorithmization.ArraysOfArrays;
// 13. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
public class Task13 {
    public static int[][] sortColumnsUp(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 1; k < array.length - j; k++) {
                    if (array[k][i] < array[k-1][i]) {
                        int temp = array[k][i];
                        array[k][i] = array[k-1][i];
                        array[k-1][i] = temp;
                    }
                }
            }
        }
        return array;
    }
    public static int[][] sortColumnsDown(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 1; k < array.length - j; k++) {
                    if (array[k][i] > array[k-1][i]) {
                        int temp = array[k][i];
                        array[k][i] = array[k-1][i];
                        array[k-1][i] = temp;
                    }
                }
            }
        }
        return array;
    }
}