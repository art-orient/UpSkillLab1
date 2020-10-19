package Algorithmization.ArraysOfArrays;
// 10. Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void findPositiveOfDiagonal (int[][] array) {
        System.out.print("Положительные элементы главной диагонали = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.print(array[i][i] + " ");
            }
        }
        System.out.println();
    }
}