package Algorithmization.Sorting;

import java.util.Arrays;

// 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их
// в один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
// дополнительный массив.
public class Task1 {
    public static int[] addArrays (int[]array1, int[] array2, int k) {
        int[] array = new int[array1.length + array2.length];
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= k) {
                array[i] = array1[i];
            } else if (i <= array2.length + k) {
                array[i] = array2[index2++];
            } else if (i > array2.length + k) {
                array[i] = array1[k++ + 1];
            }
        }
        return array;
    }
}
