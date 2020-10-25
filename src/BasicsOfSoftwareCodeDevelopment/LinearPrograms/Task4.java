package BasicsOfSoftwareCodeDevelopment.LinearPrograms;
// 4. (x * 1000) % 1000 + (int) x / 1000.0;.
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static double task4(double r) {
        if (r > 0 && r < 1000) {
            return (r * 1000) % 1000 + (int) r / 1000.0;
        } else {
            System.out.println("Полученное число не соответствует критериям");
            return -1;
        }
    }
}