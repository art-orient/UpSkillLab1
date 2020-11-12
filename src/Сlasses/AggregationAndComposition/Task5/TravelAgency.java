package Сlasses.AggregationAndComposition.Task5;

import java.util.ArrayList;
import java.util.Comparator;

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
        int sum = 0;
        for (Tour tour : tours) {
            if(tour.getType().equals(client.getType()) &&
                    tour.getTransport().equals(client.getTransport()) &&
                    tour.getFood().equals(client.getFood())) {
                sum = tour.getAmountTransport() + tour.getAmountPerDay() * client.getNumberOfnights();
                if (sum <= client.getMaxBudget()) {
                    String result = "Tour total cost $ " + sum + ":\n";
                    findTour.append(result).append(tour);
                }
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

    static class TransportComparator implements Comparator<Tour> {
        @Override
        public int compare (Tour a, Tour b){
            return a.getTransport().ordinal() - b.getTransport().ordinal();
        }
    }

    static class FoodComparator implements Comparator<Tour> {
        @Override
        public int compare (Tour a, Tour b){
            return a.getFood().ordinal() - b.getFood().ordinal();
        }
    }
}
