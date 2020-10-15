package Algorithmization.One_dimensional_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int n = 22;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        int k = 3;
        System.out.println("Task 1: sum = " + Task1.getSum(a, k));

        n = 10;
        double z = Math.random() * 2000 - 1000;
        System.out.println("\nTask 2: z = " + z);
        double[] a2 = new double[n];
        for (int i = 0; i < n; i++) {
            a2[i] = Math.random() * 2000 - 1000;
            System.out.print(a2[i] + " ");
        }
        System.out.println("\nКоличество замен = " + Task2.replaysMoreZ(a2, z));
        System.out.println(Arrays.toString(a2));

        n = 10;
        z = Math.random() * 2000 - 1000;
        System.out.println("\nTask 3:");
        double[] a3 = new double[n];
        for (int i = 0; i < n; i++) {
            a3[i] = Math.random() * 2000 - 1000;
            if (a3[i] < 100 && a3[i] > -100) {
                a3[i] = 0;
            }
            System.out.print(a3[i] + " ");
        }
        System.out.println();
        Task3.solution(a3);
    }
}