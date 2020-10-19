package Algorithmization.ArraysOfArrays;

import java.util.Scanner;

// 16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
// составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу, каждой строке и каждой из двух
// больших диагоналей равны между собой. Построить такой квадрат.
public class Task16 {
    public static int[][] makeMagic (int n) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер матрицы, n = ");
//        int n = scanner.nextInt();
        int[][] magicArray = new int[n][n];
        magicArray[0][n/2] = 1;
        int x = n / 2;
        int y = 0;
        for (int i = 1; i <= n * n; i++) {
            magicArray[y][x] = i;
            x++;
            y--;
            if (x == n && y == -1) {
                x--;
                y += 2;
            }
            if (y < 0) {
                y = n - 1;
            }
            if (x == n) {
                x = 0;
            }
            if (magicArray[y][x] != 0) {
                y += 2;
                x--;
            }

        }
//        printMagic(magicArray);
        checkMagic(magicArray);
        return magicArray;
    }

    private static int[][] fillDigits(int n) {
        int[][] array = new int[n][n];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = counter;
                counter++;
            }
        }
        return array;
    }

    static void printMagic (int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void checkMagic (int[][] array) {
        int sumDiag = 0;
        int sumDiag2 = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int sumColumn = 0;
            for (int j = 0; j < n; j++) {
                sum += array[i][j];
                sumColumn += array[j][i];
                if (i == j) {
                    sumDiag += array[i][j];
                }
                if (i + j == n - 1) {
                    sumDiag2 += array[i][j];
                }
            }
            System.out.println("Сумма чисел в строке " + i + " = " + sum);
            System.out.println("Сумма чисел в столбце " + i + " = " + sumColumn);
        }
        System.out.println("Сумма по главной диагонали  = " + sumDiag);
        System.out.println("Сумма по второй диагонали  = " + sumDiag2);
        System.out.println();
    }
}
