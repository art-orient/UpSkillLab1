package Algorithmization.One_dimensional_arrays;
// 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static double[] changeMinAndMax (double[] array) {
        double max = array[0];
        double min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        double temp = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = temp;
        return array;
    }
}
