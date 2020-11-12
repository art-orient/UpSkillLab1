package Сlasses.AggregationAndComposition.Task5;

import java.util.ArrayList;

public class TravelAgency {
    private String name;
    private ArrayList<Tour> tours;


    public TravelAgency(String name) {
        this.name = name;
        this.tours = new ArrayList<>();
    }

    public void addTour (Tour tour){
        tours.add(tour);
    }

    public String findTour (Client client){
        StringBuilder findTour = new StringBuilder();
        findTour.append("Travel Agency \"" + name + "\" has next tours:\n");
        for (Tour tour : tours) {
            if(tour.getType().equals(client.getType())) {
                tour.setNumbersOfNights(client.getNumberOfnights());
                findTour.append(tour);
            }
        }
        return findTour.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("Travel Agency \"" + name + "\" has next tours:\n");
        for (Tour tour : tours) {
            output.append(tour);
        }
        return output.toString();
    }
}
