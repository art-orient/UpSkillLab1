package Algorithmization.ArraysOfArrays;
// 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task5 {
    public static int[][] formMatrix5 (int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = i + 1;
                }
            }
        }
        return array;
    }
}