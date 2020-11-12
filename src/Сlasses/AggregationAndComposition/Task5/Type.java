package Сlasses.AggregationAndComposition.Task5;
// отдых, экскурсии, лечение, шопинг, круиз
public enum Type {
    VACATION,
    EXCURSIONS,
    TREATMENT,
    SHOPPING,
    CRUISE;

    @Override
    public String toString(){
        return super.toString().toLowerCase();
    }
}