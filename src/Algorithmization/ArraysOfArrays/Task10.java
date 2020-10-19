package Algorithmization.ArraysOfArrays;
// 10. Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void findPositiveOfDiagonal (int[][] array) {
        System.out.print("Положительные элементы главной диагонали - ");
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j && array[i][j] > 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}