package Algorithmization.DecompositionUsingMethods;
//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
//    Для решения задачи использовать декомпозицию.
public class Task13 {
    public static String findTwins (int n) {
        String twins = "";
        int twin1 = 1;
        for (int i = n; i <= 2 * n; i++) {
            if (isPrime(i)) {
                if (i == twin1 + 2) {
                    twins += twin1 + " и " + i + "; ";
                }
                twin1 = i;
            }
        }
        return twins;
    }

    public static boolean isPrime (int x) {
            boolean isPrime = true;
            for (int i = 2; i < x / i; i++) {
                if (x % i == 0) {
                    isPrime = false;
                }
            }
           return isPrime;
    }
}
