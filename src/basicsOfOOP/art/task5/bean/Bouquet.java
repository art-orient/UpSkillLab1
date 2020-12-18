package basicsOfOOP.art.task5.bean;

import basicsOfOOP.art.task5.builder.ElementData;

import java.util.HashMap;
import java.util.Map;

public class Bouquet {
    private Map<ElementData, Integer> bouquet;

    {
        bouquet = new HashMap<ElementData, Integer>();
    }

    public Bouquet() {
    }
    public Bouquet(Map<ElementData, Integer> bouquet) {
        this.bouquet = bouquet;
    }

    public Map<ElementData, Integer> getBouquet() {
        return bouquet;
    }

    public void setBouquet(Map<ElementData, Integer> bouquet) {
        this.bouquet = bouquet;
    }

    public void addElement(ElementData element, int number){
        if (bouquet.containsKey(element)){
            bouquet.put(element, bouquet.get(element) + number);
        } else {
            bouquet.put(element, number);
        }
    }

    public void removeElement(ElementData element){
        bouquet.remove(element);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquet=" + bouquet +
                '}';
    }
}
