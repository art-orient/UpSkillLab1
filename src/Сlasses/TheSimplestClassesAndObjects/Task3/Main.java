package Сlasses.TheSimplestClassesAndObjects.Task3;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Ivanov A.N.", 111, new int[] {7, 8, 10, 6, 7});
        students[1] = new Student("Kireev N.N.", 111, new int[] {6, 8, 9, 8, 8});
        students[2] = new Student("Petrov A.A.", 112, new int[] {9, 10, 10, 9, 9});
        students[3] = new Student("Dubinin S.K.", 112, new int[] {7, 6, 8, 8, 7});
        students[4] = new Student("Karapetian I.S.", 111, new int[] {9, 8, 7, 7, 7});
        students[5] = new Student("Maslova E.A.", 112, new int[] {6, 8, 8, 6, 8});
        students[6] = new Student("Rebrova O.I.", 114, new int[] {9, 9, 9, 10, 9});
        students[7] = new Student("Yanush S.D.", 114, new int[] {10, 9, 10, 9, 10});
        students[8] = new Student("Tarasov A.D.", 111, new int[] {9, 8, 6, 6, 9});
        students[9] = new Student("Bespalov R.A.", 112, new int[] {8, 8, 9, 8, 8});
        Services.findExcellent(students);
    }
}
