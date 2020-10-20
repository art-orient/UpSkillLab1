package Algorithmization.Sorting;
// 2. Реализуйте сортировку выбором.
public class Task2 {
    public static int[] sortSelection (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (array[i] > min) {
                int temp = array[i];
                array[i] = min;
                array[index] = temp;
            }
        }
        return array;
    }
}
