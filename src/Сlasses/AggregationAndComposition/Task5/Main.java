package Сlasses.AggregationAndComposition.Task5;

import java.util.Collections;

// 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
// различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class Main {
    public static void main(String[] args) {
        TravelAgency myAgency = new TravelAgency("Holidays");
        Tour vacAirAI = new Tour("Greece", "Hilton", Type.VACATION, Transport.AIR, Food.ULTRA_ALL_INCLUSIVE, 50, 400);
        Tour vacAirHB = new Tour("Greece", "Hilton", Type.VACATION, Transport.AIR, Food.BREAKFASTS_AND_DINNERS, 38, 400);
        Tour vacAirAIitaly = new Tour("Italy", "Bilbao", Type.VACATION, Transport.AIR, Food.ALL_INCLUSIVE, 45, 360);
        Tour exTrAIPoland = new Tour("Poland", "Warsaw", Type.EXCURSIONS, Transport.TRAIN, Food.ALL_INCLUSIVE, 32, 140);
        Tour exBusAIPoland = new Tour("Poland", "Warsaw", Type.EXCURSIONS, Transport.BUS, Food.ALL_INCLUSIVE, 32, 90);
        Tour exCarAIPoland = new Tour("Poland", "Warsaw", Type.EXCURSIONS, Transport.CAR, Food.ALL_INCLUSIVE, 32, 0);
        Tour exBusAIlviv = new Tour("Ukraine", "Lviv", Type.EXCURSIONS, Transport.BUS, Food.BREAKFASTS_AND_DINNERS, 28, 120);
        Tour excrAIsea = new Tour("Finland", "Riga", Type.CRUISE, Transport.SHIP, Food.ALL_INCLUSIVE, 75, 220);
        Tour shopPol = new Tour("Poland", "Belostok", Type.SHOPPING, Transport.CAR, Food.WITHOUT_FOOD, 15, 20);
        Tour vacAirAIisp = new Tour("Spain", "Madrid", Type.VACATION, Transport.AIR, Food.ALL_INCLUSIVE, 41, 340);
        myAgency.addTour(vacAirAI);
        myAgency.addTour(vacAirHB);
        myAgency.addTour(vacAirAIitaly);
        myAgency.addTour(exTrAIPoland);
        myAgency.addTour(exBusAIPoland);
        myAgency.addTour(exCarAIPoland);
        myAgency.addTour(exBusAIlviv);
        myAgency.addTour(excrAIsea);
        myAgency.addTour(shopPol);
        myAgency.addTour(vacAirAIisp);

        System.out.println("Sorting by transport type:");
        Collections.sort(myAgency.getTours(), new TravelAgency.TransportComparator());
        System.out.println(myAgency);

        System.out.println("Sorting by type of food:");
        Collections.sort(myAgency.getTours(), new TravelAgency.FoodComparator());
        System.out.println(myAgency);

        Client vasya = new Client("Vasya", Type.VACATION, Transport.AIR, Food.ALL_INCLUSIVE, 7, 700);
        System.out.println(myAgency.findTour(vasya));
    }
}
