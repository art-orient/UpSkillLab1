package Сlasses.TheSimplestClassesAndObjects.Task4;


// 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
// по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения
// должны быть упорядочены по времени отправления.
public class Main {
    public static void main(String[] args) {
        int numberTrains = 5;
        Train[] trains = new Train[numberTrains];
        trains[0] = new Train ("Minsk", 223, "19:15");
        trains[1] = new Train ("Atlanta", 18, "12.10");
        trains[2] = new Train ("Brest", 237, "10:40");
        trains[3] = new Train ("Grodno", 143, "7.50");
        trains[4] = new Train ("Minsk", 180, "11:30");

        Train.sortNumberTrain(trains);
        System.out.println("Sorted by train numbers:");
        for (int i = 0; i < trains.length; i++) {
            System.out.print(trains[i].getNumberTrain() + "-");
            System.out.print(trains[i].getDestination() + "; ");
        }
        System.out.println("\n");
        Train.printInfo(trains);
        Train.sortDestination(trains);
        System.out.println("Sorted by destination:");
        for (int i = 0; i < trains.length; i++) {
            System.out.print(trains[i].getDestination() + " - ");
            System.out.print("№ " + trains[i].getNumberTrain() + " - ");
            System.out.print(trains[i].getDepartureTime() + "; ");
        }
    }
}
