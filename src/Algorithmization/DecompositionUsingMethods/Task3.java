package Algorithmization.DecompositionUsingMethods;
// 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
public class Task3 {
    public static double areaHexagon (int a) {
        return a * a * Math.sqrt(3) * 1.5;
    }
}
