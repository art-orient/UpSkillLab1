package basicsOfOOP.art.task4.logic;

import basicsOfOOP.art.task4.bean.CaveOfDragon;
import basicsOfOOP.art.task4.bean.Treasure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service {
    public Treasure mostExpensive(List<Treasure> list){
        int maxPrice = 0;
        Treasure expensive = list.get(0);
        for (Treasure treasure : list) {
            if (treasure.getPrice() > maxPrice){
                maxPrice = treasure.getPrice();
                expensive = treasure;
            }
        }
        return expensive;
    }

    public void printInfo (CaveOfDragon cave){
        System.out.println(cave);
    }

    public List<Treasure> fillSum (List<Treasure> list, int amount){
        Collections.sort(list, new Comparator<Treasure>() {
            @Override
            public int compare(Treasure o1, Treasure o2) {
                if (o1.getPrice() > o2.getPrice()){
                    return -1;
                } else if (o1.getPrice() < o2.getPrice()){
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        List<Treasure> sum = new ArrayList<>();
        for (Treasure treasure : list) {
            if (treasure.getPrice() <= amount){
                sum.add(treasure);
                amount -= treasure.getPrice();
            }
        }
        return sum;
    }

    public int setAmount() {
        System.out.println("Введите заданную сумму:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int amount = 0;
        try {
            amount = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Неверно введена сумма. Попробуйте еще раз.");
            setAmount();
        }
        return amount;
    }
}

