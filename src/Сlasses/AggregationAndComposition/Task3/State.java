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
        this.population += territory.population;
    }

    public void printCapital(){
        System.out.println("Capital of " + name + " is " + capital.name + ".");
    }

    public void printArea(){
        System.out.println("Area of " + name + " equals " + getArea() + " square kilometers.");
    }

    public double getArea(){
        area = 0;
        for (Territory territory : regions) {
            area += territory.area;
        }
        return area;
    }

    public void printSunRegions(){
        System.out.println("Number of regions in " + name + " is " + (regions.size() - 1) + ".");
        System.out.println("Capital " + capital.name + " not included in any area.");
    }

    public void printRegionCapital() {
        System.out.print(name + " has regional centers: ");
        for (Territory territory : regions) {
            if (territory.capital != null) {
                System.out.print(territory.capital + ", ");
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
        return String.format("Country %s has capital %s and area %.2f square kilometers, there are about %d people.",
                name, capital.name, getArea(), population);
    }
}
