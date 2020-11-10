package Сlasses.AggregationAndComposition.Task3;

import java.util.ArrayList;

public class City extends Territory {
    private ArrayList<District> cityDistricts;

    public City(String name, double area, int population) {
        super(name, area, population);
    }

    public ArrayList<District> getCityDistricts() {
        return cityDistricts;
    }

    public void setCityDistricts(ArrayList<District> cityDistricts) {
        this.cityDistricts = cityDistricts;
    }
}
