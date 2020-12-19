package basicsOfOOP.art.task5var2.property;

public enum Color {
    RED ("красного цвета"),
    PINK ("розового цвета"),
    VIOLET ("фиолетового цвета"),
    BLUE ("синего цвета"),
    YELLOW ("желтого цвета"),
    BURGUNDY ("бордового цвета"),
    WHITE ("белого цвета");

    private String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
