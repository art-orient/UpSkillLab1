package Сlasses.AggregationAndComposition.Task2;
// 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
public class Main {
    public static void main(String[] args) {
        Engine D4D = new Engine(2000, "Diesel");
        Wheel michelin = new Wheel(16, "Michelin");
        Car myCar = new Car("Toyota Avensis", D4D, michelin, 4, 60, 6);
        myCar.printModel();
        myCar.fillСar(20);
        System.out.println(myCar);
        myCar.go();
        myCar.go(120);
        myCar.punchedWheel();
        myCar.changeWheel();
        myCar.fillСar(50);
        myCar.go(70);
        System.out.println(myCar);
    }
}
