package Сlasses.TheSimplestClassesAndObjects.Task5;
/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
  единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными
  значениями.
  Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
  Написать код, демонстрирующий все возможности класса.
*/
public class Main {
    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter(44, 1, 10);
        System.out.println("First counter = " + first.getCounter() + ", second counter = " + second.getCounter());
        first.addOne();
        second.minusOne();
        System.out.println("First counter = " + first.getCounter() + ", second counter = " + second.getCounter());
    }
}
