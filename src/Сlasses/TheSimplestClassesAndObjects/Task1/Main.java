package Сlasses.TheSimplestClassesAndObjects.Task1;

public class Main {
    public static void main(String[] args) {
        Test1.printInfo();
        Test1.secondVar = Test1.add100(Test1.secondVar);
        Test1.firstVar = Test1.x2(Test1.firstVar);
        Test1.printInfo();
        System.out.println("Sum = " + Test1.sum(Test1.firstVar, Test1.secondVar));
        System.out.println("Max = " + Test1.findMax(Test1.firstVar, Test1.secondVar));
    }
}
