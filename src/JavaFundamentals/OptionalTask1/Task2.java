package JavaFundamentals.OptionalTask1;

import java.util.Arrays;

public class Task2 {
    public static void sortTask2 (int[] array) {
        int temp;
        System.out.println("Task 2:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Numbers in ascending order: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Numbers in descending order: " + Arrays.toString(array));
    }
}
