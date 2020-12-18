package basicsOfOOP.art.task5.builder;

import basicsOfOOP.art.task5.bean.Bouquet;
import basicsOfOOP.art.task5.bean.Flower;
import basicsOfOOP.art.task5.bean.Packing;
import basicsOfOOP.art.task5.logic.BouquetAction;
import basicsOfOOP.art.task5.property.Color;
import basicsOfOOP.art.task5.property.Size;
import java.math.BigDecimal;

public class BouquetBuilder {
    public Bouquet makeBouquet() {
        BouquetAction bouquetAction = new BouquetAction();
        Bouquet bouquet = bouquetAction.createBouquet();
        Flower rose = new FlowerBuilder("Роза", Color.PINK, Size.MEDIUM, new BigDecimal(5.50)).build();
        Flower tulip = new FlowerBuilder("Тюльпан", Color.YELLOW, Size.BIG, new BigDecimal(3.1)).build();
        Flower gladiolus = new FlowerBuilder("Гладиолус", Color.WHITE, Size.SMALL, new BigDecimal(8)).build();
        Packing newYear = new Packing("Новогодняя упаковка", new BigDecimal(0.9));
        Packing paper = new Packing("Бумага", new BigDecimal(0));
        bouquet.addElement(rose, 5);
        bouquet.addElement(tulip, 4);
        bouquet.addElement(gladiolus, 1);
        bouquet.addElement(paper, 1);
        bouquet.removeElement(paper);
        bouquet.addElement(newYear, 1);
        return bouquet;
    }
        public Bouquet makeBouquet2() {
            BouquetAction bouquetAction = new BouquetAction();
            Bouquet bouquet = bouquetAction.createBouquet();
            Flower rose = new FlowerBuilder("Роза", Color.BURGUNDY, Size.BIG, new BigDecimal(7.50)).build();
            Flower tulip = new FlowerBuilder("Тюльпан", Color.RED, Size.MEDIUM, new BigDecimal(3.6)).build();
            Flower gladiolus = new FlowerBuilder("Гладиолус", Color.YELLOW, Size.MEDIUM, new BigDecimal(7.3)).build();
            Packing film = new Packing("Пленка с ленточками", new BigDecimal(0.50));
            Packing box = new Packing("Подарочная коробка", new BigDecimal(4.5));
            bouquet.addElement(rose, 3);
            bouquet.addElement(tulip, 3);
            bouquet.addElement(gladiolus, 5);
            bouquet.addElement(film, 1);
            bouquet.removeElement(film);
            bouquet.addElement(box, 1);
            return bouquet;
        }
}
