package Branching;
/* 3. Найти сумму квадратов первых ста чисел.*/
public class Task3 {
    public static int task3 () {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }
}
