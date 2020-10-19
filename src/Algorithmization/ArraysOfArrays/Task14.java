package Algorithmization.ArraysOfArrays;

import java.util.Scanner;

// 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
//     причем в каждом столбце число единиц равно номеру столбца.
public class Task14 {
    public static int[][] zeroOrOne () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк в матрице, m = ");
        int m = scanner.nextInt();
        System.out.print("Введите количество столбцов в матрице (не больше m), n = ");
        int n = scanner.nextInt();
        if (n > m || m <= 0 || n <= 0) {
            System.out.println("При заданных значениях задача невыполнима. Попробуйте еще раз.");
            return zeroOrOne();
        }
        int[][] array = new int[m][n];
        for (int i = 0; i < n; i++) {
            int j = 1;
            while (j <= i + 1) {
                int index = randIndex(m);
                if (array[index][i] == 0) {
                    array[index][i] = 1;
                    j++;
                }
            }
        }
        return array;
    }

    private static int randIndex(int m) {
        return (int)(Math.random() * m);
    }
}
