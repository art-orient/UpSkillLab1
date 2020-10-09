package LinearPrograms;
import static java.lang.Math.*;
// 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (см. формулу в задании)
public class Task3 {
    public static double task3 (double x, double y) {
        double result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        return result;
    }
}