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

        int[] arrayForSort = new int[20];
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int)(Math.random() * 200 - 100);
        }

        System.out.println("\nTask 2:");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println(Arrays.toString(Task2.sortSelection(arrayForSort)));
        Arrays.sort(arrayForSort);
        System.out.println("\nTask 3:");
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int)(Math.random() * 200 - 100);
        }
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println(Arrays.toString(Task3.sortBubble(arrayForSort)));
//        System.out.println(Arrays.toString(Task3.sortBubbleDesc(arrayForSort)));

        System.out.println("\nTask 4:");
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int)(Math.random() * 200 - 100);
        }
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println(Arrays.toString(Task4.sortInsert(arrayForSort)));

        System.out.println("\nTask 5:");
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = arrayForSort.length - i;
        }
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println(Arrays.toString(Task5.sortShell(arrayForSort)));

//        System.out.println("\nTime for 100_000 (наихудший случай):");
//        int[] array100000 = new int[100000];
//        for (int i = 0; i < array100000.length; i++) {
//            array100000[i] = (int)(Math.random() * 200 - 100);
//        }
//        Task2.sortSelection(array100000);
//        Task3.sortBubbleDesc(array100000);
//        Task2.sortSelection(array100000);
//
//        Task3.sortBubbleDesc(array100000);
//        Task3.sortBubble(array100000);
//
//        Task3.sortBubbleDesc(array100000);
//        Task4.sortInsert(array100000);
//
//        Task3.sortBubbleDesc(array100000);
//        Task5.sortShell(array100000);
    }
}

