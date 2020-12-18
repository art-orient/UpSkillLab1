package basicsOfOOP.art.task5.logic;

import basicsOfOOP.art.task5.bean.Bouquet;
import basicsOfOOP.art.task5.builder.ElementData;
import java.math.BigDecimal;
import java.util.Map;

public class BouquetAction {
    public void printInfo(Bouquet bouquet) {
        System.out.println("Собран букет в следующем составе:");
        for (Map.Entry<ElementData, Integer> entry : bouquet.getBouquet().entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey().getElementName()).append(", ").append(entry.getValue()).append(" шт.");
            sb.append(", по цене ").append(entry.getKey().getElementPrice()).append(" р.");
            System.out.println(sb);
        }
    }

    public void getCostBouquet(Bouquet bouquet) {
        double sum = 0;
        for (Map.Entry<ElementData, Integer> entry : bouquet.getBouquet().entrySet()) {
            sum += entry.getKey().getElementPrice().doubleValue() * entry.getValue();
        }
        System.out.println("Стоимость букета равна " + sum + " р.");
    }

    public Bouquet createBouquet() {
        return new Bouquet();
    }
}
