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

    public void printCapital(){
        System.out.println("Capital of " + name + " is " + capital.name + ".");
    }

    public void printArea(){
        area = 0;
        for (int i = 0; i < regions.size(); i++) {
            area += regions.get(i).area;
        }
        System.out.println("Area of " + name + " equals " + area + " square kilometers.");
    }

    public void printSunRegions(){
        System.out.println("Number of regions in " + name + " is " + (regions.size() - 1) + ".");
        System.out.println("Capital " + capital.name + " not included in any area.");
    }

    public void printRegionCapital() {
        System.out.print(name + " has regional centers: ");
        for (int i = 0; i < regions.size(); i++) {
            if (regions.get(i).capital != null) {
                System.out.print(regions.get(i).capital + ", ");
            }
        }
        System.out.println("\b\b.");
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
        area = 0;
        for (int i = 0; i < regions.size(); i++) {
            area += regions.get(i).area;
        }
        return String.format("Country %s has capital %s and area %.2f square kilometers, there are about %d people.",
                name, capital.name, area, population);
    }
}
