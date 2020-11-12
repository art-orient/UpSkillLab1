package Сlasses.AggregationAndComposition.Task5;

public enum Transport {
    AIR("by plane"),
    TRAIN("by train"),
    BUS("by bus"),
    CAR("by car"),
    SHIP("on the ship");

    private String name;

    Transport(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
