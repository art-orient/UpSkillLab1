package basicsOfOOP.art.task4.logic;

import basicsOfOOP.art.task4.bean.Treasure;

import java.util.Collections;
import java.util.List;

public class Service {
    public Treasure mostExpensive(List<Treasure> list){
//        Collections.max(list);
        return list.get(0);
    }

    public void printInfo (){

    }

    public List<Treasure> fillSum (List<Treasure> list, int sum){
        return list;
    }
}

