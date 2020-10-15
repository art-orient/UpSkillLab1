package Algorithmization.One_dimensional_arrays;
// 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
public class Task2 {
    public static int replaysMoreZ (double[] array, double z) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
        return counter;
    }
}
