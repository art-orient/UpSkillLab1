package Algorithmization.DecompositionUsingMethods;
// 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class Task15var2 {
    public static StringBuilder findGrow(int n) {
        if (n > 9) {
            System.out.println("Числа образуют строго возрастающую последовательность только до 9.");
            return null;
        }
        StringBuilder allNumbers = new StringBuilder();
        int number = 0;
        for (int i = 1; i < 11 - n; i++) {
            for (int j = i; j < n + i; j++) {
                number = number * 10 + j;
            }
            allNumbers.append(number + " ");
            number = 0;
        }
        return allNumbers;
    }
}