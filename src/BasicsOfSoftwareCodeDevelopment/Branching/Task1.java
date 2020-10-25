package BasicsOfSoftwareCodeDevelopment.Branching;
// 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
// и если да, то будет ли он прямоугольным.
public class Task1 {
    public static void task1(int a, int b){
        System.out.println("Task 1:");
        if ((a + b) < 180) {
            System.out.println("Треугольник существует.");
            if ((a + b) == 90 || a == 90 || b == 90) {
                System.out.println("Треугольник прямоугольный.");
            } else {
                System.out.println("Он не является прямоугольным.");
            }
        } else {
            System.out.println("Такого треугольника не существует.");
        }
    }
}
