package Сlasses.TheSimplestClassesAndObjects.Task2;
// 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.
public class Test2 {
    private String name;
    private int age;
    private static final String NAME = "Petya";
    private static final int AGE = 15;


    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test2() {
        this(NAME, AGE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
