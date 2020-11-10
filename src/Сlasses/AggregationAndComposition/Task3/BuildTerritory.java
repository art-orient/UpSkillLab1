package Сlasses.AggregationAndComposition.Task3;

public class BuildTerritory {
    {
        District frunzeMinsk = new District("Frunzenski", "urban of Minsk", 4);
        District moskowMinsk = new District("Moskowski", "urban of Minsk", 7);
        City minsk = new City("Minsk", 348, 2018281);
        minsk.addCityDistrict(frunzeMinsk);
        Region mogilevskaya = new Region("Mogilevskaya", "Mogilev", 512);

    }
}
