package Сlasses.TheSimplestClassesAndObjects.Task2;
// 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.
public class Test2 {
    String name;
    int age;

    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test2() {
        this.name = "Petya;
        this.age = 10;
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
