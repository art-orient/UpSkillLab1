package Algorithmization.DecompositionUsingMethods;
// 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
public class Task16 {
    public static int sumOddDigits(long sum) {
        int even = 0;
        while (sum != 0) {
            long digit = sum % 10;
            if (digit % 2 == 0) {
                even++;
            }
            sum = sum / 10;
        }
        return even;
    }

    public static long findSum(int n) {
        long sum = 0;
        long number = 0;
        for (int i = 1; i < Math.pow(10, n); i++) {
            if (isAllOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isAllOdd (long a){
        while (a != 0) {
            long digit = a % 10;
            if (digit % 2 == 0) {
                return false;
            }
            a = a / 10;
        }
        return true;
    }
}