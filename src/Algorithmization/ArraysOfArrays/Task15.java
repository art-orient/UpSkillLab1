package Algorithmization.ArraysOfArrays;
// 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task15 {
    public static int[][] changeMax(int[][] array) {
        int max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] % 2 != 0) {
                        array[i][j] = max;
                    }
            }
        }
        return array;
    }

    private static int findMax (int[][] array) {
        int max = array[0][0];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
        System.out.println("Максимальный элемент = " + max);
        return max;
    }
}