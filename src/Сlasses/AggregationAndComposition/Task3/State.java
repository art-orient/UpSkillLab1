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
        this.regions = new ArrayList<>();
    }

    public void addTerritory(Territory territory){
        regions.add(territory);
        this.area += territory.area;
        this.population += territory.population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
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
        return String.format("Country %s has capital %s and area %.2f square kilometers, there are about %d people.",
                name, capital.name, area, population);
    }
}
