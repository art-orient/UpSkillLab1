package basicsOfOOP.art.task5var2.builder;

import basicsOfOOP.art.task5var2.entity.Bouquet;
import basicsOfOOP.art.task5var2.entity.Gladiolus;
import basicsOfOOP.art.task5var2.entity.Rose;
import basicsOfOOP.art.task5var2.entity.Tulip;
import basicsOfOOP.art.task5var2.entity.packing.Box;
import basicsOfOOP.art.task5var2.entity.packing.NewYearPack;
import basicsOfOOP.art.task5var2.property.Color;
import basicsOfOOP.art.task5var2.property.Size;

public class BouquetBuilder {

    public Bouquet createBouquet() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose(Color.PINK, Size.MEDIUM), 5);
        bouquet.addFlower(new Tulip(Color.YELLOW, Size.BIG), 4);
        bouquet.addFlower(new Gladiolus(Color.WHITE, Size.SMALL), 1);
        bouquet.setPacking(new NewYearPack());
        bouquet.removeSeveralFlowers(new Tulip(Color.YELLOW, Size.BIG), 1);
        return bouquet;
    }

    public Bouquet createBigBouquet() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose(Color.BURGUNDY, Size.BIG), 15);
        bouquet.addFlower(new Tulip(Color.RED, Size.MEDIUM), 7);
        bouquet.addFlower(new Gladiolus(Color.YELLOW, Size.MEDIUM), 10);
        bouquet.setPacking(new Box());
        return bouquet;
    }
}
