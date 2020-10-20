package Algorithmization.Sorting;
// 5. Реализуйте сортировку Шелла.
public class Task5 {
    public static int[] sortShell (int[] array) {
        long start = System.currentTimeMillis();
        int h = 1;
        while (h * 3 < array.length) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            sortH(array, h);
            h /= 3;
        }
        long finish = System.currentTimeMillis();
        System.out.println("ShellSort = " + (finish - start) + " ms");
        return array;
    }

    private static int[] sortH (int[] array, int h) {
        for (int i = h; i < array.length; i++) {
            for (int j = i; j >= h; j -= h) {
                if (array[j] < array[j - h]) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }
}