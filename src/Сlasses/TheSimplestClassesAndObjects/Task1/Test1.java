package Сlasses.TheSimplestClassesAndObjects.Task1;
// 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
// из этих двух переменных.
public class Test1 {
    public static int firstVar = 22;
    public static int secondVar = 3;

    public static void printInfo (){
        System.out.println("First variable firstVar = " + firstVar);
        System.out.println("Second variable secondVar = " + secondVar);
    }

    public static int x2 (int number){
        return number * 2;
    }
    public static int add100 (int number){
        return number + 100;
    }
    public static int sum (int a, int b){
        return a + b;
    }
    public static int findMax (int a, int b){
        return Math.max(a, b);
    }
}
