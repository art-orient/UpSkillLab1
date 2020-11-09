package Сlasses.AggregationAndComposition.Task2;

public class Car {
    private String model;
    private Engine engine;
    private Wheel typeOfWheel;
    private int sumWheel;
    private Wheel[] wheels;
    private int fuelTankVolume;
    private int fuelRemaining;
    private int fuelConsumption;

    public Car(String model, Engine engine, Wheel typeOfWheel, int sumWheel, int fuelTankVolume, int fuelConsumption) {
        this.model = model;
        this.engine = engine;
        this.typeOfWheel = typeOfWheel;
        this.sumWheel = sumWheel;
        this.wheels = new Wheel[sumWheel];
        for (int i = 0; i < sumWheel; i++) {
            wheels[i] = new Wheel(typeOfWheel.getSize(), typeOfWheel.getBrand());
        }
        this.fuelTankVolume = fuelTankVolume;
        this.fuelConsumption = fuelConsumption;
        this.fuelRemaining = 0;
    }

    public void go(){
        System.out.println("I go by car...");
    }
    public void go(int distance){
        fuelRemaining -= distance * fuelConsumption / 100;
        int reserve = 100 * fuelRemaining/fuelConsumption;
        System.out.printf("We drove %d km. There are %d liters of fuel left. This is enough for another %d km.\n",
                distance, fuelRemaining, reserve);
    }
    public int fillСar (int liters){
        fuelRemaining += liters;
        int difference = fuelRemaining - fuelTankVolume;
        if (fuelRemaining > fuelTankVolume){
            fuelRemaining = fuelTankVolume;
            liters -= difference;
            System.out.println(difference + " liters did not fit, take the money for them");
        }
        System.out.println("Filled with " + liters + " l. Now fuel remaining = " + fuelRemaining);
        return fuelRemaining;
    }
    public void printModel(){
        System.out.println("Car model is " + model);
    }

    public void punchedWheel (){
        System.out.println("\nOops... we have a broken wheel!\n");
        int index = (int) (Math.random() * sumWheel);
        wheels[index].setGood(false);
    }

    public void changeWheel() {
        System.out.println("Looking for a broken wheel...");
        int index = -1;
        String side = "";
        for (int i = 0; i < sumWheel; i++) {
            if (!wheels[i].isGood()){
                index = i;
            }
        }
        if (index >= 0){
            switch (index) {
                case 0:
                    side = "front left";
                    break;
                case 1:
                    side = "front right";
                    break;
                case 2:
                    side = "rear right";
                    break;
                case 3:
                    side = "rear left";
                    break;
                default:
                    side = "additional inner";
            }
            System.out.println("Punctured " + side + " wheel. Now we will change it.");
        }
        wheels[index].setGood(true);
        System.out.println("The wheel has been replaced, you can go.\n");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getTypeOfWheel() {
        return typeOfWheel;
    }

    public void setTypeOfWheel(Wheel typeOfWheel) {
        this.typeOfWheel = typeOfWheel;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public int getSumWheel() {
        return sumWheel;
    }

    public void setSumWheel(int sumWheel) {
        this.sumWheel = sumWheel;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public void setFuelTankVolume(int fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }

    public int getFuelRemaining() {
        return fuelRemaining;
    }

    public void setFuelRemaining(int fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString(){
        String info = String.format("It is %s. It's engine has capacity %d and type of fuel %s." +
                        "\nThis car has %d wheels, their size = %d \", their brand is %s." +
                        "\nFuel consumption = %d l/100 km, fuel tank volume = % d l, fuel remaining = %d l." +
                        "\nThat's enough for %d km.\n", model, engine.getCapacity(), engine.getTypeOfFuel(), sumWheel,
                wheels[0].getSize(), wheels[0].getBrand(), fuelConsumption, fuelTankVolume, fuelRemaining,
                100*fuelRemaining/fuelConsumption);
        if (fuelRemaining < 5){
            info += "\nYou need to refuel the car!\n";
        }
        return info;
    }
}
