package Сlasses.AggregationAndComposition.Task3;

import java.util.ArrayList;

public class State {
    private String name;
    private City capital;
    private double area;
    private int population;
    private ArrayList<Territory> regions;

    public State (String name, City capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<Territory> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Territory> regions) {
        this.regions = regions;
    }

    @Override
    public String toString(){
        return String.format("%s has capital %s and area %.2f, there are %d people", name, capital, area, population);
    }
}
