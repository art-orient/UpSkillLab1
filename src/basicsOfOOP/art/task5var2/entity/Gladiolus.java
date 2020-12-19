package basicsOfOOP.art.task5var2.entity;

import basicsOfOOP.art.task5var2.property.Color;
import basicsOfOOP.art.task5var2.property.Size;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gladiolus extends Flower{

    public Gladiolus(Color color, Size size) {
        super("Гладиолус", color, size);
        this.price = price();
    }

    @Override
    public BigDecimal price() {
        if (size == Size.BIG){
            return new BigDecimal(9.5).setScale(2, RoundingMode.HALF_EVEN);
        } else if (size == Size.MEDIUM) {
            return new BigDecimal(8).setScale(2, RoundingMode.HALF_EVEN);
        } else {
            return new BigDecimal(6.8).setScale(2, RoundingMode.HALF_EVEN);
        }
    }
}