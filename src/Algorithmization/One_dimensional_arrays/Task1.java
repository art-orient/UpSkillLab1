package Algorithmization.One_dimensional_arrays;
// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task1 {
    public static int getSum (int[] a, int k) {
    int sum = 0;
        for (int i: a) {
            if (i % k == 0) {
                sum += i;
            }
        }
    return sum;
    }
}
