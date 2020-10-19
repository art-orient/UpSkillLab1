package Algorithmization.ArraysOfArrays;
// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task6 {
    public static int[][] formMatrix6 (int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j || j > n - i - 1) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = i + 1;
                }
            }
        }
        for (int i = n / 2; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j || j < n - i - 1) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = i + 1;
                }
            }
        }
        return array;
    }
}