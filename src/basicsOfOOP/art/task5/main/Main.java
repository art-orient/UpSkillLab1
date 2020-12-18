package basicsOfOOP.art.task5.main;

import basicsOfOOP.art.task5.bean.Bouquet;
import basicsOfOOP.art.task5.builder.BouquetBuilder;
import basicsOfOOP.art.task5.logic.BouquetAction;

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
        BouquetBuilder builder = new BouquetBuilder();
        Bouquet bouquet = builder.makeBouquet();
        bouquetAction.printInfo(bouquet);
        bouquetAction.getCostBouquet(bouquet);
        System.out.println();

        Bouquet bouquet2 = builder.makeBouquet2();
        bouquetAction.printInfo(bouquet2);
        bouquetAction.getCostBouquet(bouquet2);
    }
}
