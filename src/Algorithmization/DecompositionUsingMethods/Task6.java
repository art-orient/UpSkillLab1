package Algorithmization.DecompositionUsingMethods;
// 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class Task6 {
    public static boolean isSimple3Numbers (int a, int b, int c) {
        if (a < 1 || b < 1 || c < 1) {
            System.out.println("Введенные числа не являются натуральными. Попробуйте еще раз.");
            return false;
        }
        boolean isSimple = true;
        if (findNOD(findNOD(a, b), c) > 1){
            isSimple = false;
        }
        return isSimple;
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
