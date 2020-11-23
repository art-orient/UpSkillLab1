package BasicsOfOOP.Task4;

public abstract class Treasures {
    int cost;

    public Treasures(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
