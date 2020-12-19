package basicsOfOOP.art.task5var2.entity;

import basicsOfOOP.art.task5var2.builder.FlowerBuilder;
import basicsOfOOP.art.task5var2.property.Color;
import basicsOfOOP.art.task5var2.property.Size;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Flower implements FlowerBuilder {

    protected final String name;
    protected final Color color;
    protected final Size size;
    protected BigDecimal price;

    public Flower(String name, Color color, Size size, BigDecimal price) {
        String regex = "^[a-zA-Zа-яА-Я][a-zA-Zа-яА-Я\\s]+$";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        if (name == null || name == "" || !matcher.find()){
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
        this.size = size;
        if (price.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной.");
        }
        this.price = price.setScale(2, RoundingMode.HALF_EVEN);
    }

    public Flower(String name, Color color, Size size) {
        this (name, color, size, new BigDecimal(0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Override
    public abstract BigDecimal price();

    @Override
    public String name() {
        StringBuilder info = new StringBuilder();
        info.append(name).append(" ");
        if (color != null) {
            info.append(color).append(" ");
        }
        if (size != null){
            info.append(size);
        }
        return info.toString();
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name) && color == flower.color && size == flower.size
                && Objects.equals(price, flower.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, size, price);
    }
}
