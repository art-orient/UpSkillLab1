package Algorithmization.DecompositionUsingMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1:");
        System.out.print("Введите первое натуральное число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе натуральное число: ");
        int b = scanner.nextInt();
        Task1.findNOD(a, b);

        System.out.println("\nTask 2:");
        System.out.print("Введите первое натуральное число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе натуральное число: ");
        b = scanner.nextInt();
        System.out.print("Введите третье натуральное число: ");
        int c = scanner.nextInt();
        System.out.print("Введите четвертое натуральное число: ");
        int d = scanner.nextInt();
        System.out.println("Наибольший общий делитель = " + Task2.findNOD4(a, b, c, d));

        System.out.println("\nTask 3:");
        System.out.print("Введите сторону шестиугольника, а = ");
        a = scanner.nextInt();
        System.out.println("Площадь шестиугольника = " + Task3.areaHexagon(a));

    }
}
