package Branching;
// 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.
public class Task4 {
    public static String task4(int a, int b, int x, int y, int z) {
        if ((a >= x && b >= y) || (a >= y && b >= x) ||
            (a >= y && b >= z) || (a >= z && b >= y) ||
            (a >= x && b >= z) || (a >= z && b >= x)) {
            return "Кирпич пройдет через отверстие";
        } else {
            return "Кирпич не пройдет через отверстие";
        }
    }
}