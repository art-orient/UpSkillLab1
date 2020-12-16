package basicsOfOOP.art.task4.main;

import basicsOfOOP.art.task4.bean.CaveOfDragon;
import basicsOfOOP.art.task4.dao.TreasureStorage;
import basicsOfOOP.art.task4.menu.Menu;

import java.io.IOException;

/**Создать консольное приложение, удовлетворяющее следующим требованиям:
 • Приложение должно быть объектно-, а не процедурно-ориентированным.
 • Каждый класс должен иметь отражающее смысл название и информативный состав.
 • Наследование должно применяться только тогда, когда это имеет смысл.
 • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 • Классы должны быть грамотно разложены по пакетам.
 • Консольное меню должно быть минимальным.
 • Для хранения данных можно использовать файлы.

 Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ
 на заданную сумму.
 */
public class Main {
    public static void main(String[] args) {
        CaveOfDragon cave = new CaveOfDragon();
        TreasureStorage storage = new TreasureStorage();
        try {
            cave.setTreasures(storage.loadTreasures());
        } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        Menu menu = new Menu();
        menu.menu(cave);
    }
}
