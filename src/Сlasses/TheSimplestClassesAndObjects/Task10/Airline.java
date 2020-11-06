package Сlasses.TheSimplestClassesAndObjects.Task10;
//     Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
public class Airline {
    private static int counter = 0;
    private int id;
    private String destination;
    private int flightNumber;
    private AircraftType aircraftType;
    private String departureTime;
    private Days[] days;

    public Airline() {
        this.id = ++counter;
    }

    public Airline(AircraftType aircraftType, int flightNumber, String destination, String departureTime) {
        this.id = ++counter;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
    }

    public Airline(Days[] days) {
        this.days = days;
    }

    @Override
    public String toString(){
        StringBuilder week = new StringBuilder();
        if (this.getDays() != null){
            for (Days days: this.getDays()) {
                week.append(days).append("  ");
            }
        }
        return String.format("%-3d %-20s %-14d %-15s %-12s %s",
                id, aircraftType, flightNumber, destination, departureTime, week.toString());
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Days[] getDays() {
        return days;
    }

    public void setDays(Days[] days) {
        this.days = days;
    }
}