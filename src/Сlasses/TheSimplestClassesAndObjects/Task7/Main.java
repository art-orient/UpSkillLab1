package Сlasses.TheSimplestClassesAndObjects.Task7;
// 7. Описать класс, представляющий треугольник.
// Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(3, 5), new Point(4, 6), new Point(7, 3));
        System.out.println("Perimeter = " + triangle.perimeter());
        Triangle triangle1 = Triangle.buildTriangle();
        System.out.println("Perimeter = " + triangle1.perimeter());
        System.out.println("Area = " + triangle1.area());
        System.out.println("Centroid (point of intersection of medians):\n" + triangle1.centroid());
    }
}
