package Сlasses.TheSimplestClassesAndObjects.Task6;

public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;

    public MyTime() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public MyTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int changeHours (int hours){
        this.hours += hours;
        if (this.hours > 23){
            this.hours = this.hours % 24;
        } else if (this.hours < 0){
            this.hours = 24 + this.hours % 24;
        }
        return this.hours;
    }

    public int changeMinutes (int minutes){
        this.minutes += minutes;
        if (this.minutes > 59){
            changeHours(this.minutes / 60);
            this.minutes = this.minutes % 60;
        } else if (this.minutes < 0){
            changeHours(this.minutes / 60);
            this.minutes = this.minutes % 60;
            if (this.minutes < 0){
                changeHours(-1);
                this.minutes = this.minutes + 60;
            }
        }
        return this.minutes;
    }
    
    public int changeSeconds (int seconds){
        this.seconds += seconds;
        if (this.seconds > 59){
            changeMinutes(this.seconds / 60);
            this.seconds = this.seconds % 60;
        } else if (this.seconds < 0){
            changeMinutes(this.seconds / 60);
            this.seconds = this.seconds % 60;
            if (this.seconds < 0){
                changeMinutes(-1);
                this.seconds = this.seconds + 60;
            }
        }
        return this.minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours >= 0 && hours < 24 ? hours : 0;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes >= 0 && minutes < 60 ? minutes : 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds >= 0 && seconds < 60 ? seconds : 0;
    }
}
