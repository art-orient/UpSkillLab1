package Сlasses.TheSimplestClassesAndObjects.Task10;

import java.util.ArrayList;

/*  10. Создать класс Airline, спецификация которого приведена ниже.
    Определить конструкторы, set- и get- методы и метод  toString().
    Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
    Задать критерии выбора данных и вывести эти данные на консоль.
    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
        Найти и вывести:
    a) список рейсов для заданного пункта назначения;
    b) список рейсов для заданного дня недели;
    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/
public class Main {
    public static void main(String[] args) {
        AirCompany airCompany = new AirCompany();
        String heading = "ID  Aircraft Type   Flight Number    Destination   Departure Time    Flight Days";
        System.out.println(heading);
        Airline airline1 = new Airline(AircraftType.BOEING_737, 836, "Atlanta", "18:40");
        airline1.setDays(new Days[]{Days.MON, Days.WED, Days.FRI});
        airCompany.addAirline(airline1);
        Airline airline2 = new Airline(AircraftType.Super_jet_100, 234, "Boston", "07:15");
        airline2.setDays(new Days[]{Days.TUES, Days.FRI});
        airCompany.addAirline(airline2);
        Airline airline3 = new Airline(AircraftType.TU_134, 76, "Moscow", "13:40");
        airline3.setDays(new Days[]{Days.MON, Days.THURS, Days.SAT});
        airCompany.addAirline(airline3);
        Airline airline4 = new Airline(AircraftType.BOEING_737, 534, "Chikago", "19:20");
        airline4.setDays(new Days[]{Days.WED, Days.FRI, Days.SUN});
        airCompany.addAirline(airline4);
        Airline airline5 = new Airline(AircraftType.AIRBUS_A330, 222, "Berlin", "10:00");
        airline5.setDays(new Days[]{Days.TUES, Days.THURS, Days.SAT});
        airCompany.addAirline(airline5);
        Airline airline6 = new Airline(AircraftType.Super_jet_100, 653, "Paris", "06:50");
        airline6.setDays(new Days[]{Days.MON, Days.WED, Days.FRI});
        airCompany.addAirline(airline6);
        Airline airline7 = new Airline(AircraftType.AIRBUS_A330, 186, "Warsaw", "15:10");
        airline7.setDays(new Days[]{Days.WED, Days.SUN});
        airCompany.addAirline(airline7);
        Airline airline8 = new Airline(AircraftType.BOEING_737, 755, "Atlanta", "09:30");
        airline8.setDays(new Days[]{Days.MON, Days.TUES, Days.WED, Days.THURS, Days.FRI, Days.SAT, Days.SUN});
        airCompany.addAirline(airline8);
        System.out.println(airCompany);

        String findDestination = "Atlanta";
        ArrayList<Airline> sampleDestination = airCompany.getDestination(findDestination);
        System.out.println("All flights to " + findDestination + ":");
        System.out.println(heading);
        for (Airline airline: sampleDestination) {
            System.out.println(airline);
        }

        Days findDays = Days.FRI;
        ArrayList<Airline> sampleDays = airCompany.getDays(findDays);
        System.out.println("\nAll flights on " + findDays + ":");
        System.out.println(heading);
        for (Airline airline: sampleDays) {
            System.out.println(airline);
        }

        String afterTime = "15:00";
        ArrayList<Airline> sampleTime = airCompany.getDaysAndTime(findDays, afterTime);
        System.out.println("\nAll flights on " + findDays + " after " + afterTime + ":");
        System.out.println(heading);
        for (Airline airline: sampleTime) {
            System.out.println(airline);
        }
    }
}
