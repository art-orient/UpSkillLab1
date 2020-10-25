package BasicsOfSoftwareCodeDevelopment.Branching;
// 5. Вычислить значение функции: (смотри формулу)
public class Task5 {
    public static double task5(int x){
        double result;
        if (x > 3) {
            result = 1.0 / (x * x * x + 6);
        } else {
            result = x * x - 3 * x + 9;
        }
        return result;
    }
}