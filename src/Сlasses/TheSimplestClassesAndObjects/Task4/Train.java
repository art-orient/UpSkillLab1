package Сlasses.TheSimplestClassesAndObjects.Task4;
import java.time.LocalTime;
import java.util.Scanner;

public class Train {
    private String destination;
    private int numberTrain;
    private LocalTime departureTime;

    public Train(String destination, int numberTrain, String time) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        String[] hourAndMinuts = time.split("[:\\.]");
        int hour = Integer.parseInt(hourAndMinuts[0]);
        int minuts = Integer.parseInt(hourAndMinuts[1]);
        this.departureTime = LocalTime.of(hour, minuts);
    }

    public static Train[] sortNumberTrain (Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            for (int j = i+1; j < trains.length; j++) {
                if (trains[j].numberTrain < trains[i].numberTrain) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
        return trains;
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
}
