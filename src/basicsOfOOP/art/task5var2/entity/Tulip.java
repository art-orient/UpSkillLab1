package basicsOfOOP.art.task5var2.entity;

import basicsOfOOP.art.task5var2.property.Color;
import basicsOfOOP.art.task5var2.property.Size;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tulip extends Flower{

    public Tulip (Color color, Size size) {
        super("Тюльпан", color, size, new BigDecimal(3.6).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Override
    public String name() {
        StringBuilder info = new StringBuilder();
        info.append("Тюльпан").append(" ");
        if (color != null) {
            info.append(color).append(" ");
        }
        if (size != null){
            info.append(size);
        }
        return info.toString();
    }

    @Override
    public BigDecimal price() {
        if (size == Size.BIG){
            return new BigDecimal(3.9).setScale(2, RoundingMode.HALF_EVEN);
        } else if (size == Size.MEDIUM) {
            return new BigDecimal(3.6).setScale(2, RoundingMode.HALF_EVEN);
        } else {
            return new BigDecimal(2.8).setScale(2, RoundingMode.HALF_EVEN);
        }
    }
}
