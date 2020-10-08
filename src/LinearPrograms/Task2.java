package LinearPrograms;
// 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (см. формулу в задании)
public class Task2 {
    public static double task2 (double a, double b, double c) {
        double result = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        return result;
    }
}
