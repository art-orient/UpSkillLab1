package Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;

// 5. Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
public class Task5 {
    public static int getSubMax (int[] array){
        int indexMax = getMax(array);
//        int temp = array[indexMax];
        array[indexMax] = Integer.MIN_VALUE;
        return array[getMax(array)];
    }
    public static int getMax (int[] array){
        int indexMax = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }
}
