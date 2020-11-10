package Сlasses.AggregationAndComposition.Task3;

import java.util.ArrayList;

public class FillDistricts {
    public static void fillDistricts(ArrayList regions){
        System.out.println(regions.get(1));
        Region brestReg = (Region) regions.get(1);
        Region vitebskReg = (Region) regions.get(2);
        Region gomelReg = (Region) regions.get(3);
        Region grodnoReg = (Region) regions.get(4);
        Region minskReg = (Region) regions.get(5);
        Region mogilevReg = (Region) regions.get(6);

        District minskDistrict = new District("Minsk district", "Minsk", 1902.66);
        minskReg.addDistrict(minskDistrict);
        District berezinoDistrict = new District("Berezino district", "Berezino", 1940.34);
        minskReg.addDistrict(berezinoDistrict);
        District borisovDistrict = new District("Borisov district", "Borisov", 2987.63);
        minskReg.addDistrict(borisovDistrict);
        District otherDistricts = new District("other districts", "anything", 197440);
        minskReg.addDistrict(otherDistricts);
    }
}
