package Сlasses.AggregationAndComposition.Task5;
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
        myAgency.addTour(vacAirAI);
        myAgency.addTour(vacAirHB);
        myAgency.addTour(vacAirAIitaly);
        myAgency.addTour(exTrAIPoland);
        myAgency.addTour(exBusAIPoland);
        myAgency.addTour(exCarAIPoland);

        Client vasya = new Client("Vasya", Type.VACATION, Transport.AIR, Food.ALL_INCLUSIVE, 7, 1500);
        System.out.println(myAgency.findTour(vasya));
//        System.out.println(myAgency);

    }
}
