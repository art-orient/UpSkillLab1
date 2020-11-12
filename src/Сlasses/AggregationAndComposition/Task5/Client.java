package Сlasses.AggregationAndComposition.Task5;

public class Client {
    private String name;
    private Type type;
    private Transport transport;
    private Food food;
    private int numberOfnights;
    private int maxBudget;

    public Client(String name, Type type, Transport transport, Food food, int numberOfnights, int maxBudget) {
        this.name = name;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberOfnights = numberOfnights;
        this.maxBudget = maxBudget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNumberOfnights() {
        return numberOfnights;
    }

    public void setNumberOfnights(int numberOfnights) {
        this.numberOfnights = numberOfnights;
    }

    public int getMaxBudget() {
        return maxBudget;
    }

    public void setMaxBudget(int maxBudget) {
        this.maxBudget = maxBudget;
    }

    @Override
    public String toString(){
        return name;
    }
}
