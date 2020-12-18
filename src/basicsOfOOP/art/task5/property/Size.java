package basicsOfOOP.art.task5.property;

public enum Size {
    BIG ("большого размера"),
    MEDIUM ("среднего размера"),
    SMALL ("маленького размера");

    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
