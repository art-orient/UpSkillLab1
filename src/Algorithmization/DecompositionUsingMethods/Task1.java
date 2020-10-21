package Algorithmization.DecompositionUsingMethods;
// 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего
// кратного двух натуральных чисел: ...
public class Task1 {
    public static int findNOD (int a, int b) {
        if (a < 1 || b < 1) {
            System.out.println("Введенные числа не являются натуральными. Попробуйте еще раз.");
            return -1;
        }
        int nok = a * b;
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println("Наибольший общий делитель = " + a);
        System.out.println("Наибольшee общee кратное = " + nok/a);
        return a;
    }
}
