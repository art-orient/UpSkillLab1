package LinearPrograms;

public class Main {
    public static void main(String[] args) {
        double a = 1.6;
        double b = 5;
        double c = 7;
        System.out.println("Task 1:  z = " + Task1.task1(a, b, c));
        System.out.println("Task 2:  result = " + Task2.task2(a, b, c));
        double x = 0.4;
        double y = 1.5;
        System.out.println("Task 3:  result = " + Task3.task3(x, y));
        double r = 345.678;
        System.out.println("Task 4:  Original number = " + r + ", result = " + Task4.task4(r));
        int t = 73505;
        System.out.println("Task 5:  Time in seconds = " + t + ", result = " + Task5.task5(t));
        System.out.println("Task 6:"); // так как выше уже есть x и y - для проверки создан цикл с использованием i и j
        for (int j = 5; j > -5; j--) {
            for (int i = -6; i < 7; i++) {
                if (Task6.task6(i, j)) {
                    System.out.print("▒");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}