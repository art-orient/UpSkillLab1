package Algorithmization.ArraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

// 16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
// составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу, каждой строке и каждой из двух
// больших диагоналей равны между собой. Построить такой квадрат.
public class Task16 {
    public static int[][] makeMagic () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер стороны квадрата, n = ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Квадрата с таким размером не бывает. Даже магического...");
            return makeMagic();
        } else if (n == 1) {
            System.out.println("1 - очень магическое число. Но такой квадрат строить даже не нужно!");
            return makeMagic();
        } else if (n == 2) {
            System.out.println("2 - слишком магическое число. Все маги мира не смогли построить магический квадрат такого размера!");
            return makeMagic();
        } else if (n == 4) {
            int[][] array4 = build4(fillDigits(n));
            printMagic(array4);
            checkMagic(array4);
            return array4;
        } else if (n % 2 == 0) {
            System.out.println("Мы начали его строить. Но пока не закончили...");
            System.out.println("Попробуйте ввести число до 5 или любое разумное нечетное");
            return makeMagic();
        }
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

    private static int[][] build4(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i][i];
            array[i][i] = array[n - i - 1][n - i - 1];
            array[n - i - 1][n - i - 1] = temp;
            temp = array[n - i - 1][i];
            array[n - i - 1][i] = array[i][n - i - 1];
            array[i][n - i - 1] = temp;
        }
        return array;
    }

    static void checkMagic (int[][] array) {
        int sumDiag = 0;
        int sumDiag2 = 0;
        int n = array.length;
        int[] allDigits = new int[n*n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int sumColumn = 0;
            for (int j = 0; j < n; j++) {
                sum += array[i][j];
                sumColumn += array[j][i];
                allDigits[index++] = array[i][j];
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
        Arrays.sort(allDigits);
        boolean isAllDigits = true;
        for (int i = 1; i < n*n; i++) {
            if (Arrays.binarySearch(allDigits, i) < 0) {
                System.out.println("Мы потеряли цифру " + i);
                isAllDigits = false;
            }
        }
        if (isAllDigits) {
            System.out.println("Успешно проверено наличие всех цифр от 1 до n*n = " + n*n);
        }
        System.out.println();
    }
}
