package Branching;
// 2. Найти max{min(a, b), min(c, d)}.
public class Task2 {
    public static int task2(int a, int b, int c, int d){
        int min1 = findMin(a, b);
        int min2 = findMin(c, d);
        if (min1 >= min2) {
            return min1;
        } else {
            return min2;
        }
    }
    private static int findMin (int a, int b) {
        int min = 0;
        if (a <= b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}