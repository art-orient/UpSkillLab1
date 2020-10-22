package Algorithmization.DecompositionUsingMethods;
// 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
public class Task3 {
    public static double areaHexagon (int a) {
        return area3(a) * 6;
    }
    public static double area3 (int a) {
        return a * a * Math.sqrt(3) / 4;
    }
}
