package Algorithmization.One_dimensional_arrays;
// 7. Даны действительные числа а1 ,а2 ,..., аn. Найти ...
public class Task7 {
    public static double maxPairOfNumbers (double[] array) {
        double max = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if (array[i] + array[array.length - 1 - i] > max) {
                max = array[i] + array[array.length - 1 - i];
            }
        }
        return max;
    }
}
