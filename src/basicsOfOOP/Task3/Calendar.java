package basicsOfOOP.Task3;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Day> days;

    public Calendar() {
        this.days = new ArrayList<>();
    }

    public void addDay(int day, boolean isDayOff, boolean isHolidaY){
        days.add(new Day(day, isDayOff, isHolidaY));
    }

    public void addDay(int day){
        days.add(new Day(day, false, false));
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (Day day : days) {
            str.append(day).append("\n");
        }
        return str.toString();
    }

    private class Day{
        private int day;
        private boolean isDayOff;
        private boolean isHoliday;

        public Day(int day, boolean isDayOff, boolean isHoliday) {
            this.day = day;
            this.isDayOff = isDayOff;
            this.isHoliday = isHoliday;
        }

        @Override
        public String toString(){
            String dayType;
            if (isHoliday) {
                dayType = "holiday (day off).";
            } else if (isDayOff){
                dayType = "day off.";
            } else {
                dayType = "working day.";
            }
            return "Day " + day + " is " + dayType;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public boolean isDayOff() {
            return isDayOff;
        }

        public void setIsDayOff(boolean isDayOff) {
            this.isDayOff = isDayOff;
        }

        public boolean isHoliday() {
            return isHoliday;
        }

        public void setIsHoliday(boolean holiday) {
            isHoliday = holiday;
        }
    }
}
