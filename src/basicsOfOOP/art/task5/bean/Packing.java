package basicsOfOOP.art.task5.bean;

import basicsOfOOP.art.task5.builder.ElementData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Packing implements ElementData {
    private final String name;
    private final BigDecimal price;

    public Packing(String name, BigDecimal price) {
        this.name = name;
        this.price = price.setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String getElementName() {
        return name;
    }

    @Override
    public BigDecimal getElementPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packing pack = (Packing) o;
        return Objects.equals(name, pack.name) && Objects.equals(price, pack.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Package{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
