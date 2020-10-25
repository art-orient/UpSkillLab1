package BasicsOfSoftwareCodeDevelopment.Cycles;

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
        char[] array1 = new char[str1.length()];
        char[] array2 = new char[str2.length()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = str1.charAt(i);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = str2.charAt(i);
        }
        String digits = "В обоих числах есть цифры: ";
        for (char i : array1) {
            for (char j : array2) {
                if (i == j) {
                    digits = digits.replace(i + " ", "");
                    digits += i + " ";
                    }
            }
        }
        System.out.print(digits);
    }
}