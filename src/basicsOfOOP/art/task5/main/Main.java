package basicsOfOOP.art.task5.main;

import basicsOfOOP.art.task5.bean.Bouquet;
import basicsOfOOP.art.task5.bean.Flower;
import basicsOfOOP.art.task5.bean.Package;
import basicsOfOOP.art.task5.logic.BouquetAction;
import basicsOfOOP.art.task5.property.Color;
import basicsOfOOP.art.task5.property.Size;

import java.math.BigDecimal;

/** Задача 5.
 Создать консольное приложение, удовлетворяющее следующим требованиям:
 Корректно спроектируйте и реализуйте предметную область задачи.
 Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
 Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 для проверки корректности переданных данных можно применить регулярные выражения.
 Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

 Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
 (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.

 Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
 Составляющими целого подарка являются сладости и упаковка.
 */
public class Main {
    public static void main(String[] args) {
        BouquetAction bouquetAction = new BouquetAction();
        Flower rose = new Flower("Роза", Color.PINK, Size.MEDIUM, new BigDecimal(5.50));
        Flower tulip = new Flower("Тюльпан", Color.YELLOW, Size.BIG, new BigDecimal(3.1));
        Flower gladiolus = new Flower("Гладиолус", Color.WHITE, Size.SMALL, new BigDecimal(8));
        Package film = new Package("Пленка с ленточками", new BigDecimal(0.50));
        Bouquet bouquet = bouquetAction.createBouquet();
        bouquet.addElement(rose, 5);
        bouquet.addElement(tulip, 4);
        bouquet.addElement(gladiolus, 1);
        bouquet.addElement(film, 1);

        bouquetAction.printInfo(bouquet);
        bouquetAction.getCostBouquet(bouquet);
    }
}
