package Сlasses.AggregationAndComposition.Task3;
// 3. Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Main {
    public static void main(String[] args) {
        City minsk = new City("Minsk", 348, 2018281);
        State belarus = new State("Belarus", minsk);
        Region brestReg = new Region("Brest region", "Brest", 1348115);
        Region vitebskReg = new Region("Vitebsk region", "Vitebsk", 1135731);
        Region gomelReg = new Region("Gomel region", "Gomel", 1388512);
        Region grodnoReg = new Region("Grodno region", "Grodno", 1026816);
        Region minskReg = new Region("Minsk region", "Minsk", 1471240);
        Region mogilevReg = new Region("Mogilev region", "Mogilev", 1024751);

        belarus.addTerritory(minsk);
        belarus.addTerritory(brestReg);
        belarus.addTerritory(vitebskReg);
        belarus.addTerritory(gomelReg);
        belarus.addTerritory(grodnoReg);
        belarus.addTerritory(minskReg);
        belarus.addTerritory(mogilevReg);
        FillDistricts.fillDistricts(belarus.getRegions());
        belarus.printCapital();
        belarus.printSunRegions();
        belarus.printArea();
        belarus.printRegionCapital();
        System.out.println("\n" + belarus);
    }
}
