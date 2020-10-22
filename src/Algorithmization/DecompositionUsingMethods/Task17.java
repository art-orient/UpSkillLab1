package Algorithmization.DecompositionUsingMethods;
// 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Task17 {
    public static int subSumToZero (int x) {
        int count = 0;
        while (x != 0) {
            x -= sumDigits(x);
            count++;
        }
        return count;
    }

    public static int sumDigits (int x) {
        int sum = 0;
        while (x != 0){
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}