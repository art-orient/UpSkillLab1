package Сlasses.AggregationAndComposition.Task3;

import java.util.ArrayList;

public class City extends Territory {
    private ArrayList<District> cityDistricts;

    public City(String name, double area, int population) {
        super(name, area, population);
        this.cityDistricts = new ArrayList<>();
    }

    public void addCityDistrict(District district){
        cityDistricts.add(district);
    }

    public ArrayList<District> getCityDistricts() {
        return cityDistricts;
    }

    public void setCityDistricts(ArrayList<District> cityDistricts) {
        this.cityDistricts = cityDistricts;
    }
}
