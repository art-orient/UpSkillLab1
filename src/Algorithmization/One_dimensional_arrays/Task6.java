package Algorithmization.One_dimensional_arrays;
// 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.
public class Task6 {
    public static double sumPrimeIndex (double[] array) {
        double sum = 0;
        for (int i = 1; i < array.length; i++) {
            boolean isPrimeIndex = true;
            for (int j = 2; j * j <= (i + 1); j++) {
                if ((i + 1) % j == 0) {
                    isPrimeIndex = false;
                }
            }
            if (isPrimeIndex) {
                sum += array[i];
                System.out.println(i + 1 + " " + array[i]);
            }
        }
        return sum;
    }
}
