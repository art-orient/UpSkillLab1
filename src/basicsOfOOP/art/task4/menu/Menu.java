package basicsOfOOP.art.task4.menu;

import basicsOfOOP.art.task4.bean.CaveOfDragon;
import basicsOfOOP.art.task4.bean.Treasure;
import basicsOfOOP.art.task4.logic.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Menu {
    public void menu(CaveOfDragon cave){
        System.out.println("Выберите нужное действие:");
        System.out.println("1 - Показать все сокровища.");
        System.out.println("2 - Показать самое дорогое сокровище.");
        System.out.println("3 - Выбрать сокровища на заданную сумму.");
        System.out.println("0 - Выход из программы.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choiсe = -1;
        try {
            choiсe = Integer.parseInt(reader.readLine());
        } catch (Exception e){
            System.out.println("Неверно введены данные! Введите цифру от 0 до 3:");
            menu(cave);
        }
        Service service = new Service();
        switch (choiсe){
            case 1 -> service.printInfo(cave);
            case 2 -> {
                System.out.print("Самое дорогое сокровище:");
                System.out.println(service.mostExpensive(cave.getTreasures()));
            }
            case 3 -> {
                int amount = service.setAmount();
                List<Treasure> sum = service.fillSum(cave.getTreasures(), amount);
                System.out.println(sum);
                int myAmount = 0;
                for (Treasure treasure : sum) {
                    myAmount += treasure.getPrice();
                }
                System.out.println("Итого набрано сокровищ на сумму " + myAmount);
            }
            case 0 -> System.exit(0);
            default -> {
                System.out.println("Неверно введены данные! Введите цифру от 0 до 3:");
                menu(cave);
            }
        }
    }
}
