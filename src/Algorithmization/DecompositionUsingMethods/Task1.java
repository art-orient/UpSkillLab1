package Algorithmization.DecompositionUsingMethods;

import java.util.Scanner;

// 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего
// кратного двух натуральных чисел: ...
public class Task1 {
    public static void findNOD () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое натуральное число: ");
        int inputA = scanner.nextInt();
        System.out.print("Введите второе натуральное число: ");
        int inputB = scanner.nextInt();
        if (inputA < 1 || inputB < 1) {
            System.out.println("Введенные числа не являются натуральными. Попробуйте еще раз.");
            return;
        }
        int nod = inputA;
        int b = inputB;
        while (b != 0){
            int temp = nod % b;
            nod = b;
            b = temp;
        }
        System.out.println("Наибольший общий делитель = " + nod);
        System.out.println("Наибольшee общee кратное = " + (inputA * inputB)/nod);
    }
}
