package Algorithmization.DecompositionUsingMethods;
// 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
// Для решения задачи использовать декомпозицию.

// в условии задания есть ошибка - нужна сумма цифр, возведеннЫХ в степень n, а не сумма, возведенная в эту степень.
// https://ru.wikipedia.org/wiki/Число_Армстронга
public class Task14 {
    public static String findArmstrong(int k) {
        String armstrong = "";
        for (int i = 1; i <= k; i++) {
            if (sumArmstrong(i) == i) {
                armstrong += i + " ";
            }
        }
        return armstrong;
    }

    public static int sumArmstrong(int x) {
        int n = lengthN(x);
        int sum = 0;
        while (x != 0) {
            sum += Math.pow(x % 10, n);
            x = x / 10;
        }
        return sum;
    }

    public static int lengthN(int x) {
        return Integer.toString(x).length();
    }
}