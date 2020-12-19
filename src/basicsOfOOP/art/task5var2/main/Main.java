package basicsOfOOP.art.task5var2.main;

import basicsOfOOP.art.task5var2.builder.BouquetBuilder;
import basicsOfOOP.art.task5var2.entity.Bouquet;

public class Main {
    public static void main(String[] args) {
        BouquetBuilder builder = new BouquetBuilder();
        Bouquet bouquet = builder.createBouquet();
        bouquet.printInfo();
        bouquet.getCostBouquet();

        Bouquet bigBouquet = builder.createBigBouquet();
        bigBouquet.printInfo();
        bigBouquet.getCostBouquet();
    }
}
