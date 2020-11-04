package Сlasses.TheSimplestClassesAndObjects.Task3;

public class Services {
    private static final int MIN_GRADE = 9;
    public static void findExcellent(Student[] students){
        for (int i = 0; i < students.length; i++) {
            boolean excellent = true;
            for (int j = 0; j < students[i].performance.length; j++) {
                if (students[i].performance[j] < MIN_GRADE) {
                    excellent = false;
                }
            }
            if (excellent) {
                System.out.println("Student " + students[i].lastNameAndInitials + ", group is " + students[i].numberGroup);
            }
        }
    }
}
