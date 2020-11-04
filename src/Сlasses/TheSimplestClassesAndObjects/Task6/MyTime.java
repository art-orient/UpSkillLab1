package Сlasses.TheSimplestClassesAndObjects.Task6;

import java.time.LocalTime;

public class MyTime {
    private LocalTime time;

    public MyTime(LocalTime time) {
        this.time = time;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
