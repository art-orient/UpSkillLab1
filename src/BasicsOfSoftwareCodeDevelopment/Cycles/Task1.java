package BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;
//1. Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.
public class Task1 {
    public static int task1 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();
        if (number > 0) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            return sum;
        } else {
            System.out.println("Число введено неверно, попробуйте еще раз.");
            return -1;
        }
    }
}
