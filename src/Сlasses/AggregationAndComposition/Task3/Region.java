package Сlasses.AggregationAndComposition.Task3;

import java.util.ArrayList;

public class Region extends Territory{
    private String capital;
    private ArrayList<District> districts;

    public Region(String name, String capital, int population) {
        super(name, 0, population);
        this.capital = capital;
        this.districts = new ArrayList<>();
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
