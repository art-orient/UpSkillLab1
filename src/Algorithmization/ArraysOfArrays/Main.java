package Algorithmization.ArraysOfArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int[][] array = {
                {8, 6, 2, 8, 9, 7},
                {5, 8, 3, 2, 4, 1},
                {6, 9, 1, 4, 2, 8},
                {5, 3, 5, 9, 7, 2},
                {2, 5, 6, 7, 2, 6},
                {7, 7, 4, 3, 8, 5}};
        System.out.println("Task 1: ");
        Task1.printTask1(array);
        System.out.println("Task 2: ");
        Task2.printDiagonal(array);
        System.out.println("Task 3: ");
        int k = 3;
        int p = 4;
        Task3.printLineK_AndColumnP(array, k, p);
        System.out.println("Task 4: ");
        int n = 8;
        int[][] array4 = Task4.formMatrix(n);
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[0].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 5: ");
        int[][] array5 = Task5.formMatrix5(n);
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[0].length; j++) {
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 6: ");
        int[][] array6 = Task6.formMatrix6(n);
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[0].length; j++) {
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 7: ");
        double[][] array7 = Task7.formMatrix7(n);
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[0].length; j++) {
                System.out.print(array7[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Task 8:\nИсходная матрица:");
        n = 10;
        int[][] array8 = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array8[i][j] = count++;
                System.out.print(array8[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] changeArray8 = Task8.changeColumns(array8);
        if (changeArray8 != null) {
            System.out.println("Матрица после замены столбцов:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(changeArray8[i][j] + "\t");
                }
                System.out.println();
            }
        } else return;

        System.out.println("Task 9:");
        Task9.sumNumbersInColumn(changeArray8);

        System.out.println("Task 10:\nИсходная матрица:");
        n = 10;
        int[][] array10 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array10[i][j] = (int)(Math.random() * 200 - 100);
                System.out.print(array10[i][j] + "\t");
            }
            System.out.println();
        }
        Task10.findPositiveOfDiagonal(array10);

        System.out.println("\nTask 11:");
        Task11.find3by5();

        System.out.println("\nTask 12:");
        int[][] array12 = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                array12[i][j] = (int) (Math.random() * 100);
                System.out.print(array12[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[][] array12sortUp = Task12.sortUp(array12);
        for (int i = 0; i < array12sortUp.length; i++) {
            for (int j = 0; j < array12sortUp[0].length; j++) {
                System.out.print(array12sortUp[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[][] array12sortDown = Task12.sortDown(array12);
        for (int i = 0; i < array12sortDown.length; i++) {
            for (int j = 0; j < array12sortDown[0].length; j++) {
                System.out.print(array12sortDown[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTask 13:");
        int[][] array13 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array13[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print(array13[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[][] array13ColumnsUp = Task13.sortColumnsUp(array13);
        for (int i = 0; i < array13ColumnsUp.length; i++) {
            for (int j = 0; j < array13ColumnsUp[0].length; j++) {
                System.out.print(array13ColumnsUp[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[][] array13ColumnsDown = Task13.sortColumnsDown(array13);
        for (int i = 0; i < array13ColumnsDown.length; i++) {
            for (int j = 0; j < array13ColumnsDown[0].length; j++) {
                System.out.print(array13ColumnsDown[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTask 14:");
        int[][] array14 = Task14.zeroOrOne();
        for (int i = 0; i < array14.length; i++) {
            for (int j = 0; j < array14[0].length; j++) {
                System.out.print(array14[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("\nTask 15:");
        int[][] array15 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array15[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print(array15[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[][] array15new = Task15.changeMax(array15);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array15new[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTask 16:");
        int[][] magicArray = Task16.makeMagic();
        Task16.printMagic(magicArray);
    }
}