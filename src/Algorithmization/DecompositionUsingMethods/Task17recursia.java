package Algorithmization.DecompositionUsingMethods;
// 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Task17recursia {
    public static Integer subSumToZero (int x, Integer count) {
        if (x == 0) {
            return count;
        }
            x -= sumDigits(x);
            count++;
        return subSumToZero(x, count);
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