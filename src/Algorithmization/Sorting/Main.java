package Algorithmization.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        int k = 7;
        int[] array = new int[15];
        int[] array1 = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array.length + i;
            System.out.print(array1[i] + "\t");
        }
        System.out.println("\nk = " + k);
        System.out.println(Arrays.toString(Task1.addArrays(array, array1, k)));

        System.out.println("\nTask 2:");
        int[] arrayForSort = new int[20];
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int)(Math.random() * 200 - 100);
        }
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println(Arrays.toString(Task2.sortSelection(arrayForSort)));
    }
}
