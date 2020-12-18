package basicsOfOOP.art.task5.bean;

import basicsOfOOP.art.task5.builder.ElementData;
import basicsOfOOP.art.task5.builder.FlowerBuilder;
import basicsOfOOP.art.task5.property.Color;
import basicsOfOOP.art.task5.property.Size;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Flower implements ElementData {
    private final String name;
    private final Color color;
    private final Size size;
    private BigDecimal price;

    public Flower(String name, Color color, Size size, BigDecimal price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price.setScale(2, RoundingMode.HALF_EVEN);
    }

    public Flower(FlowerBuilder builder) {
        this.name = builder.getName();
        this.color = builder.getColor();
        this.size = builder.getSize();
        this.price = builder.getPrice();
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String getElementName() {
        StringBuilder info = new StringBuilder();
        info.append(name).append(" ");
        if (color != null){
            info.append(color).append(" ");
        }
        if (size != null){
            info.append(size);
        }
        return info.toString();
    }

    @Override
    public BigDecimal getElementPrice() {
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name) && color == flower.color
                && size == flower.size && Objects.equals(price, flower.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, size, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
