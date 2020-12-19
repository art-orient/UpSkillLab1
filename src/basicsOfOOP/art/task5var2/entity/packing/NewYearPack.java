package basicsOfOOP.art.task5var2.entity.packing;

import basicsOfOOP.art.task5var2.builder.Packing;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class NewYearPack implements Packing {

    @Override
    public String pack(){
        return "Новогодняя упаковка";
    }

    @Override
    public BigDecimal price(){
        return new BigDecimal(0.9).setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Новогодняя упаковка по цене " + price() + " р.";
    }
}