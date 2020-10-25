package BasicsOfSoftwareCodeDevelopment.Branching;
// 2. Найти max{min(a, b), min(c, d)}.
public class Task2 {
    public static int task2(int a, int b, int c, int d){
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}