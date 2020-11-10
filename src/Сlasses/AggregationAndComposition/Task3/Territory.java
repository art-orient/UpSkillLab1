package Сlasses.AggregationAndComposition.Task3;

public abstract class Territory {
    protected String name;
    protected double area;
    protected int population;

    public Territory(String name, double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }
}
