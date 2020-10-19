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
        for (int i = 0; i < array4[0].length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 5: ");
        int[][] array5 = Task5.formMatrix5(n);
        for (int i = 0; i < array5[0].length; i++) {
            for (int j = 0; j < array5.length; j++) {
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 6: ");
        int[][] array6 = Task6.formMatrix6(n);
        for (int i = 0; i < array6[0].length; i++) {
            for (int j = 0; j < array6.length; j++) {
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task 7: ");
        double[][] array7 = Task7.formMatrix7(n);
        for (int i = 0; i < array7[0].length; i++) {
            for (int j = 0; j < array7.length; j++) {
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
        System.out.println("Матрица после замены столбцов:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array8[i][j] + "\t");
            }
            System.out.println();
        }

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
    }
}