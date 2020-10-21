package Algorithmization.DecompositionUsingMethods;
// 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class Task2 {
    public static int findNOD4 (int a, int b, int c, int d) {
        if (a < 1 || b < 1 || c < 1 || d < 1) {
            System.out.println("Введенные числа не являются натуральными. Попробуйте еще раз.");
            return -1;
        }
        return findNOD(findNOD(a, b), findNOD(c, d));
    }
    public static int findNOD (int a, int b) {
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}