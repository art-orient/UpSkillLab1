package Algorithmization.ArraysOfArrays;
// 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void printDiagonal (int[][] array) {
        String diagonal1 = "";
        String diagonal2 = "";
        for (int i = 0; i < array[0].length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == j) {
                    diagonal1 += array[i][j] + " ";
                    }
                    if (i + j == array[0].length - 1) {
                        diagonal2 += array[i][j] + " ";
                    }
                }
        }
        System.out.println("Диагональ 1 - " + diagonal1);
        System.out.println("Диагональ 2 - " + diagonal2);
    }
}
