package Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Task 1:");
//        System.out.print("Введите первое натуральное число: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите второе натуральное число: ");
//        int b = scanner.nextInt();
//        System.out.println("Наибольший общий делитель = " + Task1.findNOD(a, b));
//        System.out.println("Наименьшee общee кратное = " + Task1.findNOK(a, b));
//
//        System.out.println("\nTask 2:");
//        System.out.print("Введите первое натуральное число: ");
//        a = scanner.nextInt();
//        System.out.print("Введите второе натуральное число: ");
//        b = scanner.nextInt();
//        System.out.print("Введите третье натуральное число: ");
//        int c = scanner.nextInt();
//        System.out.print("Введите четвертое натуральное число: ");
//        int d = scanner.nextInt();
//        System.out.println("Наибольший общий делитель = " + Task2.findNOD4(a, b, c, d));
//
//        System.out.println("\nTask 3:");
//        System.out.print("Введите сторону шестиугольника, а = ");
//        a = scanner.nextInt();
//        System.out.println("Площадь шестиугольника = " + Task3.areaHexagon(a));

        System.out.println("\nTask 4:");
        System.out.print("Введите количество точек, n = ");
        int n = scanner.nextInt();
        int[] points = Task4.findDistance(n);
        System.out.printf("Максимальное расстояние между точками %d и %d с координатами %d, %d и %d, %d.\n",
                points[0], points[3], points[1], points[2], points[4], points[5]);

        System.out.println("\nTask 5:");
        int[] array5 = new int[20];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array5));
        System.out.println("Второе по величине число в массиве = " + Task5.getSubMax(array5));

    }
}
