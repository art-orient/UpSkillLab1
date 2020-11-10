package Сlasses.AggregationAndComposition.Task3;

import java.util.ArrayList;

public class Region extends Territory{
    private ArrayList<District> districts;

    public Region(String name, String capital, int population) {
        super(name, 0, population);
        super.capital = capital;
        this.capital = capital;
        this.districts = new ArrayList<>();

    }

    public void addDistrict(District district){
        districts.add(district);
        this.area += district.getArea();
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }
}
