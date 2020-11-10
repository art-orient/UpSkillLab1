package Сlasses.AggregationAndComposition.Task3;
// 3. Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Main {
    public static void main(String[] args) {
        City minsk = new City("Minsk", 348, 2018281);
        State belarus = new State("Belarus", minsk);
        System.out.println(belarus);
    }
}
