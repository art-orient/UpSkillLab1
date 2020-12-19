package basicsOfOOP.art.task5var2.entity;

import basicsOfOOP.art.task5var2.property.Color;
import basicsOfOOP.art.task5var2.property.Size;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rose extends Flower{

    public Rose(Color color, Size size) {
        super("Роза", color, size, new BigDecimal(5.50).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Override
    public BigDecimal price() {
        if (size == Size.BIG){
            return new BigDecimal(6.5).setScale(2, RoundingMode.HALF_EVEN);
        } else if (size == Size.MEDIUM) {
            return new BigDecimal(5.5).setScale(2, RoundingMode.HALF_EVEN);
        } else {
            return new BigDecimal(4.0).setScale(2, RoundingMode.HALF_EVEN);
        }
    }
}
