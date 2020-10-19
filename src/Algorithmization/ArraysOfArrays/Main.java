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
        for (int i = 0; i < array4[0].length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }
    }
}