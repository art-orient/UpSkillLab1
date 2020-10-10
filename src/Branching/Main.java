package Branching;

public class Main {
    public static void main(String[] args) {
        int a = 48;
        int b = 42;
        Task1.task1(a, b);
        a = 324;
        b = 15;
        int c = 3;
        int d = 532;
        System.out.println("Task 2: result = " + Task2.task2(a, b, c, d));
        int x1, y1, x2, y2, x3, y3;
        x1 = 3;
        y1 = 7;
        x2 = 5;
        y2 = 10;
        x3 = 7;
        y3 = 13;
        System.out.println("Task 3: " + Task3.task3(x1, y1, x2, y2, x3, y3));
        Task4.task4();
        Task5.task5();
    }
}
