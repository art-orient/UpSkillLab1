package Сlasses.TheSimplestClassesAndObjects.Task4;

import java.util.Date;

// 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
// по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
// должны быть упорядочены по времени отправления.
public class Main {
    public static void main(String[] args) {
        int numberTrains = 5;
        Train[] trains = new Train[numberTrains];
        trains[0] = {"Minsk", 223, 19:15};
        trains[1] = {"Atlanta", 18, 12.10};
        trains[2] = {"Brest", 237, 10.40};
        trains[3] = {"Grodno", 143, 7.50};
        trains[4] = {"Minsk", 180, 11.30};

        System.out.println(trains[0].departureTime);

    }
}
