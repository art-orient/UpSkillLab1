package Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1:");
        System.out.print("Введите первое натуральное число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе натуральное число: ");
        int b = scanner.nextInt();
        System.out.println("Наибольший общий делитель = " + Task1.findNOD(a, b));
        System.out.println("Наименьшee общee кратное = " + Task1.findNOK(a, b));

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

        System.out.println("\nTask 6:");
        System.out.println("Введите три натуральных числа: ");
        int a6 = scanner.nextInt();
        int b6 = scanner.nextInt();
        int c6 = scanner.nextInt();
        if (Task6.isSimple3Numbers(a6, b6, c6)) {
            System.out.printf("Числа %d, %d и %d являются взаимно простыми.", a6, b6, c6);
        } else {
            System.out.printf("Числа %d, %d и %d не являются взаимно простыми.", a6, b6, c6);
        }

        System.out.println("\nTask 7:");
        System.out.println("Сумма факториалов нечетных чисел от 1 до 9 = " + Task7.sumFactorialsOddNumbers());

        System.out.println("\nTask 8:");
        int[] array8 = new int[15];
        for (int i = 0; i < array8.length; i++) {
            array8[i] = (int)(Math.random()*100);
        }
        System.out.println("Для проверки решения используем массив из 15 элементов:");
        System.out.println(Arrays.toString(array8));
        System.out.println("Введите номер элемента массива (от 0 до 12), начиная с которого вычислим сумму 3 идущих подряд элементов:");
        int k = scanner.nextInt();
        System.out.printf("Сумма 3 элементов массива, начиная с элемента номер %d  = %d.",
                            k, Task8.sum3elemArray(array8, k));

        System.out.println("\nTask 9:");
        System.out.println("Введите длины 4 сторон прямоугольника (x, y, z, t):");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.print("z = ");
        int z = scanner.nextInt();
        System.out.print("t = ");
        int t = scanner.nextInt();
        System.out.println("Площаль четырехугольника = " + Task9.areaQuadrangle(x, y, z, t));

        System.out.println("\nTask 10:");
        System.out.print("Введите натуральное число N: ");
        int n10 = scanner.nextInt();
        System.out.println("Из цифр этого числа сформирован массив:");
        System.out.println(Arrays.toString(Task10.arrayFromDigits(n10)));

        System.out.println("\nTask 11:");
        System.out.println("Введите два натуральных числа:");
        int xx = scanner.nextInt();
        int yy = scanner.nextInt();
        int result11 = Task11.moreDigits(xx, yy);
        if (result11 == 0) {
            System.out.println("В этих числах одинаковое количество цифр");
        } else {
            System.out.println("Наибольшее количество цифр в числе " + result11);
        }

        System.out.println("\nTask 12:");
        System.out.print("Введите число K (сумма цифр искомых чисел): ");
        int k12 = scanner.nextInt();
        System.out.print("Введите число N (максимально возможное число): ");
        int n12 = scanner.nextInt();
        System.out.println(Arrays.toString(Task12.formArray12(k12, n12)));

        System.out.println("\nTask 13:");
        System.out.print("Введите натуральное число N (больше 2): ");
        int n13 = scanner.nextInt();
        System.out.println("Найденные пары \"близнецов\" - " + Task13.findTwins(n13));

        System.out.println("\nTask 14:");
        System.out.print("Введите натуральное число k: ");
        int k14 = scanner.nextInt();
        System.out.println("Найденные числа Армстронга - " + Task14.findArmstrong(k14));

        System.out.println("\nTask 15:");
        System.out.print("Введите количество цифр в числе (от 2 до 9), n = ");
        int n15 = scanner.nextInt();
        System.out.println("Найденные числа - " + Task15.findGrow(n15));

        System.out.println("\nTask 16:");
        System.out.print("Введите количество цифр в числе (от 2 до 9), n = ");
        int n16 = scanner.nextInt();
        long sum = Task16.findSum(n16);
        System.out.println("Полученная сумма = " + sum);
        System.out.println("Четных цифр в этой сумме - " + Task16.sumOddDigits(sum));
    }
}
