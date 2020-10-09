package Branching;

import java.util.Scanner;

//6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//   m и n вводятся с клавиатуры.
public class Task6 {
    public static void task6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите нижнюю границу интервала m: ");
        int m = scanner.nextInt();
        System.out.print("Введите верхнюю границу интервала n: ");
        int n = scanner.nextInt();
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }
        boolean isNumbers = false;
        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i-1; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    isNumbers = true;
                }
            }
            if (!isNumbers) {
                System.out.print("делителей нет");
            }
            System.out.println();
            isNumbers = false;
        }
    }
}
