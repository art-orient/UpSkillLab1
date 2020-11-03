package Сlasses.TheSimplestClassesAndObjects.Task1;
// 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
// из этих двух переменных.

public class Main {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.printInfo();
        test.setFirstVar(15);
        test.setSecondVar(17);
        test.printInfo();
        System.out.println("Sum = " + test.sum());
        System.out.println("Max = " + test.findMax());
    }
}
