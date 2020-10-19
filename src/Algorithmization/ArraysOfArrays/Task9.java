package Algorithmization.ArraysOfArrays;
// 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.
public class Task9 {
    public static void sumNumbersInColumn (int[][] array) {
        int maxSum = 0;
        int columnMaxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[0].length; j++) {
                sum += array[j][i];
            }
            System.out.printf("Сумма элементов столбца %d = %d\n", i, sum);
            if (sum > maxSum) {
                maxSum = sum;
                columnMaxSum = i;
            }
        }
        System.out.println("Максимальную сумму содержит столбец " + columnMaxSum);
    }
}

