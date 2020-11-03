package Сlasses.TheSimplestClassesAndObjects.Task3;
// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Student {
    String lastNameAndInitials;
    int numberGroup;
    int[] performance = new int[5];

    public Student() {
    }
    public Student(String lastNameAndInitials, int numberGroup, int[] performance) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.numberGroup = numberGroup;
        this.performance = performance;
    }
}
