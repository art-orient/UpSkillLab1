package Сlasses.AggregationAndComposition.Task5;

public enum Food {
    ULTRA_ALL_INCLUSIVE,
    ALL_INCLUSIVE,
    BREAKFASTS_AND_DINNERS,
    WITHOUT_FOOD;

    @Override
    public String toString(){
        return super.toString().toLowerCase().replace("_", " ");
    }
}
