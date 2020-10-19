package Algorithmization.ArraysOfArrays;
// 7. Сформировать квадратную матрицу порядка N по правилу: ... и подсчитать количество положительных элементов в ней.
public class Task7 {

    public static double[][] formMatrix7 (int n) {
        int counter = 0;
        double[][] array = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sin((double)(i * i - j * j) / n);
                if (array[i][j] > 0) {
                    counter++;
                }
            }
        }
        System.out.println("Количество положительных элементов в матрице = " + counter);
//      Можно не вводить counter и не проверять на > 0,
//      так как в данной задаче counter = (n * n - n) / 2.
        return array;
    }
}