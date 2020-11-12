package Сlasses.AggregationAndComposition.Task5;

public class Tour {
    private String country;
    private String hotelName;
    private Type type;
    private Transport transport;
    private Food food;
    private int numbersOfNights;
    private int amountPerDay;
    private int amountTransport;

    public Tour(String country, String hotelName, Type type, Transport transport, Food food, int amountPerDay, int amountTransport) {
        this.country = country;
        this.hotelName = hotelName;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.amountPerDay = amountPerDay;
        this.amountTransport = amountTransport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getNumbersOfNights() {
        return numbersOfNights;
    }

    public void setNumbersOfNights(int numbersOfNights) {
        this.numbersOfNights = numbersOfNights;
    }

    public int getAmountPerDay() {
        return amountPerDay;
    }

    public void setAmountPerDay(int amountPerDay) {
        this.amountPerDay = amountPerDay;
    }

    public int getAmountTransport() {
        return amountTransport;
    }

    public void setAmountTransport(int amountTransport) {
        this.amountTransport = amountTransport;
    }

    @Override
    public String toString(){
        int cost = this.amountTransport + this.amountPerDay * this.numbersOfNights;
        return String.format("We have tour in %s, in hotel \"%s\" has type - %s, use transport - %s, type of food - %s." +
                "\nTour for %d nights cost $ %d. There is every day cost additional $ %d.\n",
                country, hotelName, type, transport, food, numbersOfNights, cost, amountPerDay);
    }
}
