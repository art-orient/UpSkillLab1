package BasicsOfSoftwareCodeDevelopment.LinearPrograms;
import static java.lang.Math.*;
// 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (см. формулу в задании)
public class Task3 {
    public static double task3 (double x, double y) {
        double divider = cos(x) - sin(y);
        try {
            if (divider == 0) {
                throw new ArithmeticException("Задача не имеет решения (деление на ноль)");
            }
            return (sin(x) + cos(y)) / divider * tan(x * y);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        }
    }
}