package Сlasses.AggregationAndComposition.Task2;

public class Wheel {
    private String brand;
    private int size;
    private boolean isGood;

    public Wheel(int size, String brand) {
        this.size = size;
        this.brand = brand;
        this.isGood = true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean isGood) {
        this.isGood = isGood;
    }
}
