package Сlasses.TheSimplestClassesAndObjects.Task4;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.Scanner;

public class Train {
    private String destination;
    private int numberTrain;
    private LocalTime departureTime;

    public Train(String destination, int numberTrain, String time) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        String[] hourAndMinuts = time.split("[:\\. -]");
        int hour = Integer.parseInt(hourAndMinuts[0]);
        int minuts = Integer.parseInt(hourAndMinuts[1]);
        this.departureTime = LocalTime.of(hour, minuts);
    }

    public static void printInfo (Train[] trains){
        System.out.print("Enter the number of the train you are interested in: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (Train train : trains) {
            if (train.numberTrain == number){
                    System.out.println(train);
                return;
            }
        }
        System.out.println("There is no train with this number on the schedule");
    }

    public String toString (){
        String info = String.format("Trains № %d will arrive in %s at %s.\n",
                this.numberTrain, this.destination, this.departureTime);
        return info;
    }

    public static Train[] sortDestination (Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            for (int j = i+1; j < trains.length; j++) {
                if (trains[i].destination.compareToIgnoreCase(trains[j].destination) > 0) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (trains[i].destination.equalsIgnoreCase(trains[j].destination)) {
                    if (trains[i].departureTime.isAfter(trains[j].departureTime)) {
                        Train temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
        return trains;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    static class NumberComparator implements Comparator<Train>{
        @Override
        public int compare (Train a, Train b){
            return a.numberTrain - b.numberTrain;
        }
    }

    static class DestinationComparator implements Comparator<Train>{
        @Override
        public int compare (Train a, Train b){
            int flag = a.destination.compareToIgnoreCase(b.destination);
            if (flag == 0){
                DepartureTimeComparator test = new DepartureTimeComparator();
                return test.compare(a, b);
//                return a.departureTime.compareTo(b.departureTime);
            } else {
                return flag;
            }
        }
    }
    static class DepartureTimeComparator implements Comparator<Train>{
        @Override
        public int compare (Train a, Train b){
            return a.departureTime.compareTo(b.departureTime);
        }
    }
}
