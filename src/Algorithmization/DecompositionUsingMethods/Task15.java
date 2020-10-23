package Algorithmization.DecompositionUsingMethods;
// 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class Task15 {
    public static StringBuilder findGrow(int n) {
        if (n > 9) {
            System.out.println("Числа образуют строго возрастающую последовательность только до 9.");
            return null;
        }
        StringBuilder allNumbers = new StringBuilder();
        for (int i = (int)Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (checkGrow(i)) {
                allNumbers.append(i + " ");
            }
        }
        return allNumbers;
    }

    public static boolean checkGrow (int x) {
        int digit1 = x % 10;
        while (x > 9) {
            x = x / 10;
            int digit2 = x % 10;
            if (digit1 <= digit2) {
                return false;
            }
            digit1 = digit2;
        }
        return true;
    }
}
