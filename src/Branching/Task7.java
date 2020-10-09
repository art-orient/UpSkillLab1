package Branching;

import java.util.Scanner;

// 7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task7 {
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        String str1 = String.valueOf(number1);
        String str2 = String.valueOf(number2);
        for (int i = 0; i < 10; i++) {
            String strI = String.valueOf(i);
            if (str1.indexOf(strI) >= 0) {
                if (str2.indexOf(strI) >= 0) {
                    System.out.println("В обоих числах есть цифра " + i);
                }
            }
        }
    }
}