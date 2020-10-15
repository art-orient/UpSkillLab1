package LinearPrograms;
// 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (см. формулу в задании)
public class Task2 {
    public static void task2 (double a, double b, double c) {
        double discriminant = b * b + 4 * a * c;
        try {
            if (a == 0 || b == 0) {
                throw new ArithmeticException("При данных аргументах задача не имеет решения (деление на ноль)");
            }
            if (discriminant < 0) {
                throw new ArithmeticException("При данных аргументах задача не имеет решения (дискриминант < 0)");
            } else if (discriminant == 0) {
                System.out.println("x = " +  (b / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)));
            } else {
                System.out.println("При данных аргументах у задачи два решения:");
                System.out.println("x1 = " + ((b + Math.sqrt(discriminant)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)));
                System.out.println("x2 = " + ((b - Math.sqrt(discriminant)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)));
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}


