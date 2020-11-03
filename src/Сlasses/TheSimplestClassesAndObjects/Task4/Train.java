package Сlasses.TheSimplestClassesAndObjects.Task4;
import java.time.LocalTime;
public class Train {
    String destination;
    int numberTrain;
    LocalTime departureTime;

    public Train(String destination, int numberTrain, LocalTime departureTime) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
    }
}
