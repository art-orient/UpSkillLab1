package Algorithmization.DecompositionUsingMethods;
// 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
public class Task9 {
    public static double areaQuadrangle (int x, int y, int z, int t){
        double area = areaTriangleXandY(x, y);
        double d = diagonal(x, y);
        double geron = 0.5 * (z + t + d);
        double areaTriangleZTD = Math.sqrt(geron * (geron - z) * (geron - t) * (geron - d));
        area += areaTriangleZTD;
        return area;
    }

    public static double areaTriangleXandY (int x, int y){
        return 0.5 * x * y;
    }

    public static double diagonal (int x, int y){
        return Math.sqrt(x * x + y * y);
    }
}
