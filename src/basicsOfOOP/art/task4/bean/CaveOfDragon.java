package basicsOfOOP.art.task4.bean;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaveOfDragon implements Serializable {
    private List<Treasure> treasures;

    @Serial
    private static final long serialVersionUID = 1L;

    {
        treasures = new ArrayList<Treasure>();
    }

    public CaveOfDragon() {
    }

    public CaveOfDragon(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    public void addTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    public Treasure getTreasure(int index) {
        if (index < treasures.size() && index >= 0) {
            return treasures.get(index);
        } else {
            return null;
        }
    }

    public void setTreasure(int index, Treasure treasure) {
        this.treasures.set(index, treasure);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaveOfDragon that = (CaveOfDragon) o;
        return treasures.equals(that.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasures);
    }

    @Override
    public String toString() {
        return "CaveOfDragon {" + "treasures = " + treasures + "}";
    }
}
