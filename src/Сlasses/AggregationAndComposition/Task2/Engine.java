package Сlasses.AggregationAndComposition.Task2;

public class Engine {
    private int capacity;
    private String typeOfFuel;

    public Engine(int capacity, String typeOfFuel) {
        this.capacity = capacity;
        this.typeOfFuel = typeOfFuel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
