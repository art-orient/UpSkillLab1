package Algorithmization.Sorting;
// 4. Реализуйте сортировку вставками.
public class Task4 {
    public static int[] sortInsert (int[] array) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else {
                    break;
                }
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("InsertSort = " + (finish - start) + " ms");
        return array;
    }
}