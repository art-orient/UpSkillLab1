package basicsOfOOP.art.task5var2;

import basicsOfOOP.art.task5var2.entity.packing.Film;
import basicsOfOOP.art.task5var2.builder.Bouquet;
import basicsOfOOP.art.task5var2.builder.Packing;

import java.math.BigDecimal;

public abstract class BouquetFilm implements Bouquet {

    @Override
    public Packing packing(){
        return new Film();
    }

    @Override
    public abstract BigDecimal price();
}
