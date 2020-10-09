package LinearPrograms;
// 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static double task4 (double r) {
        String number = String.valueOf(r);
        String leftSide = number.substring(0,3);
        String rightSide = number.substring(4);
        return Double.valueOf(rightSide + "." + leftSide);
    }
}