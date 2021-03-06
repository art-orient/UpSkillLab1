package basicsOfOOP.art.task4.bean;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {
    private int price;
    private String name;

    @Serial
    private static final long serialVersionUID = 1L;

    public Treasure() {
    }

    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        if (name == null) return false;
        return price == treasure.price && name.equals(treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    @Override
    public String toString() {
        return "\nTreasure [" + "name = " + name + ", price = " + price + ']';
    }
}
