package basicsOfOOP.art.task5.builder;

import basicsOfOOP.art.task5.bean.Flower;
import basicsOfOOP.art.task5.property.Color;
import basicsOfOOP.art.task5.property.Size;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlowerBuilder {
    private String name;
    private Color color;
    private Size size;
    private BigDecimal price;

    public FlowerBuilder (String name, Color color, Size size, BigDecimal price){
        if (name == null || name == ""){
            throw new IllegalArgumentException("Для цветка нужно ввести название.");
        }
        this.name = name;
        if (color == null){
            throw new NullPointerException("Укажите цвет для цветка.");
        }
        this.color = color;
        if (size == null){
            throw new NullPointerException("Укажите размер цветка.");
        }
        if (price.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной.");
        }
        this.price = price.setScale(2, RoundingMode.HALF_EVEN);
    }

    public Flower build() {
        return new Flower(this);
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

    public BigDecimal getPrice() {
        return price;
    }
}
