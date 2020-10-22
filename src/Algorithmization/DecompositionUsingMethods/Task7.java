package Algorithmization.DecompositionUsingMethods;
// 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Task7 {
    public static int sumFactorialsOddNumbers (){
        int sum = 0;
        for (int i = 1; i < 10; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }
    public static int factorial (int x){
        int fact = 1;
        for (int i = 2; i <= x ; i++) {
            fact *= i;
        }
        return fact;
    }
}
