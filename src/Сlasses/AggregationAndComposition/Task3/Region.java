package Сlasses.AggregationAndComposition.Task3;

import java.util.ArrayList;

public class Region {
    private String capital;
    private ArrayList<District> districts;

    public Region(String capital, ArrayList<District> districts) {
        super();
        this.capital = capital;
        this.districts = districts;
    }

    public Region(String capital) {
        super();
        this.capital = capital;
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
