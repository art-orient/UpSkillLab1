package Сlasses.TheSimplestClassesAndObjects.Task7;

public class Point {
    private double x;
    private double y;

    @Override
    public String toString(){
        return String.format("This point has x = %f and y = %f", x, y);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
