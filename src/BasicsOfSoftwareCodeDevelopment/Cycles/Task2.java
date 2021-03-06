package BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;

public class Task2 {
    public static int[] task2 () {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало отрезка a: ");
        int a = scanner.nextInt();
        System.out.print("Введите конец отрезка b: ");
        int b = scanner.nextInt();
        System.out.print("Введите шаг значений функции h: ");
        int h = scanner.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int len = 1 + (b - a) / h;
        if ((b - a) % h != 0) {
            len++;
        }
        int[] array = new int[len];
        int x = a;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = x > 2 ? x : -x;
            x += h;
        }
        array[len-1] = b > 2 ? b : -b;
        return array;
    }
}
/* Так как значения аргументов функции с заданным шагом могут не совпасть с концом интервала, то для включения
 в результат функции числа b оно рассчитывается независимо от шага */