package basicsOfOOP.art.task5var2.entity.packing;

import basicsOfOOP.art.task5var2.builder.Packing;
import java.math.BigDecimal;

public class Film implements Packing {

    @Override
    public String pack(){
        return "Пленка с ленточками";
    }

    @Override
    public BigDecimal price(){
        return new BigDecimal(0.5);
    }
}
