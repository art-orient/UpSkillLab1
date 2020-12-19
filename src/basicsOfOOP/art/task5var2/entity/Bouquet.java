package basicsOfOOP.art.task5var2.entity;

import basicsOfOOP.art.task5var2.builder.Packing;
import java.util.HashMap;
import java.util.Map;

public class Bouquet {

    private Map<Flower, Integer> flowers;
    private Packing packing;

    {
        flowers = new HashMap<Flower, Integer>();
    }

    public void addFlower(Flower flower, int number){
        if (flowers.containsKey(flower)){
            flowers.put(flower, flowers.get(flower) + number);
        } else {
            flowers.put(flower, number);
        }
    }

    public void removeFlower(Flower flower){
        flowers.remove(flower);
    }

    public void removeSeveralFlowers(Flower flower, int number){
        if (flowers.get(flower) >= number) {
            flowers.put(flower, flowers.get(flower) - number);
        }
    }

    public void printInfo() {
        System.out.println("Собран букет в следующем составе:");
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey().name()).append(", ").append(entry.getValue()).append(" шт.");
            sb.append(", по цене ").append(entry.getKey().price()).append(" р.");
            System.out.println(sb);
        }
        System.out.println("Упаковка букета - " + packing);
    }

    public void getCostBouquet() {
        double sum = 0;

        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            sum += entry.getKey().price().doubleValue() * entry.getValue();
        }
        sum += packing.price().doubleValue();
        System.out.printf("Стоимость букета равна %.2f р.\n\n", sum);
    }

    public Packing getPacking() {
        return packing;
    }

    public void setPacking(Packing packing) {
        this.packing = packing;
    }
}
