package Algorithmization.One_dimensional_arrays;
// 8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
public class Task8 {
    public static int[] arrayWithoutMin(int[] array) {
        int min = array[0];
        int counter = 0;
        for (int i : array) {
            if (i == min) {
                counter++;
            } else if (i < min) {
                min = i;
            }
        }
        int[] minArray = new int[array.length - counter];
        for (int i = 0; i < minArray.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > min) {
                    minArray[i] = array[j];
                    break;
                }
            }
        }
        System.out.println("min = " + min);
        return minArray;
    }
}
