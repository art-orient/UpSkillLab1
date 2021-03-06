package Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

// 4. На плоскости заданы своими координатами n точек. Написать метод(методы),
// определяющие, между какими из пар точек самое большое расстояние.
// Указание. Координаты точек занести в массив.
public class Task4 {

    public static int[] findDistance (int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести координаты " + n + " точек.");
        int [] array = new int[n * 2];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите координаты для точки " + (i + 1) + ":");
            System.out.print("x = ");
            array[i * 2] = scanner.nextInt();
            System.out.print("y = ");
            array[i * 2 + 1] = scanner.nextInt();
        }

        double distance = 0;
        int[] points = new int[6];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double temp = distance2points(array[i * 2], array[i * 2 + 1], array[j * 2], array[j * 2 + 1]);
                if (temp > distance) {
                    distance = temp;
                    points[0] = i + 1;
                    points[1] = array[i * 2];
                    points[2] = array[i * 2 + 1];
                    points[3] = j + 1;
                    points[4] = array[j * 2];
                    points[5] = array[j * 2 + 1];
                }
            }
        }
        return points;
    }

    private static double distance2points (int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
