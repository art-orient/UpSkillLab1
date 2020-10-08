package JavaFundamentals.OptionalTask1;

import java.util.Arrays;

public class Task2_by_length {
    public static void sortLengthTask2 (int[] array) {
        int temp;
        System.out.println("Task 2 - sort by length:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (String.valueOf(array[j]).length() < String.valueOf(array[j - 1]).length()) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Numbers in ascending order of their length: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (String.valueOf(array[j]).length() > String.valueOf(array[j - 1]).length()) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Numbers in descending order of their length: " + Arrays.toString(array));
}
}
