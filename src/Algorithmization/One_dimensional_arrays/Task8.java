package Algorithmization.One_dimensional_arrays;
// 8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
public class Task8 {
    public static void arrayWithoutMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        for (int i: array) {
            if (i > min) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nmin = " + min);
    }
}
