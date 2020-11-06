package Сlasses.TheSimplestClassesAndObjects.Task10;

import java.util.ArrayList;

public class AirCompany {
    private ArrayList<Airline> airCompany;

    public AirCompany() {
        airCompany = new ArrayList<Airline>();
    }

    public AirCompany(ArrayList<Airline> airCompany) {
        this.airCompany = airCompany;
    }

    public void addAirline(Airline airline) {
        airCompany.add(airline);
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        for (Airline airline : airCompany) {
            output.append(airline).append("\n");
        }
        return output.toString();
    }




    public ArrayList<Airline> getAirCompany() {
        return airCompany;
    }

    public void setAirCompany(ArrayList<Airline> airCompany) {
        this.airCompany = airCompany;
    }

    public ArrayList<Airline> getDestination(String destination){
        ArrayList<Airline> sampleDestination = new ArrayList<Airline>();
        for (Airline airline : airCompany) {
            if (airline.getDestination().equalsIgnoreCase(destination)){
                sampleDestination.add(airline);
            }
        }
        return sampleDestination;
    }

    public ArrayList<Airline> getDays(Days day){
        ArrayList<Airline> sampleDays = new ArrayList<Airline>();
        for (Airline airline : airCompany) {
            for (Days dayAirline : airline.getDays()) {
                if (dayAirline == day) {
                    sampleDays.add(airline);
                }
            }
        }
        return sampleDays;
    }

    public ArrayList<Airline> getDaysAndTime(Days day, String time){
        ArrayList<Airline> sampleDaysAndTime = new ArrayList<Airline>();
        for (Airline airline : getDays(day)) {
            if (sumMinutes(airline.getDepartureTime()) >= sumMinutes(time)) {
                sampleDaysAndTime.add(airline);
            }
        }
        return sampleDaysAndTime;
    }

    public static int sumMinutes(String time){
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        return hours * 60 + minutes;
    }
}
