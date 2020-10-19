package Algorithmization.ArraysOfArrays;
// 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void printDiagonal (int[][] array) {
        StringBuilder diagonal1 = new StringBuilder();
        StringBuilder diagonal2 = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (i == j) {
                        diagonal1 = diagonal1.append(array[i][j] + " ");
                    }
                    if (i + j == array[0].length - 1) {
                        diagonal2 = diagonal2.append(array[i][j] + " ");
                    }
                }
        }
        System.out.println("Диагональ 1 - " + diagonal1.toString());
        System.out.println("Диагональ 2 - " + diagonal2.toString());
    }
}
