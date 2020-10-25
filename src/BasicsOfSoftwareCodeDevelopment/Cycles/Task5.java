package BasicsOfSoftwareCodeDevelopment.Cycles;
// 5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Task5 {
    public static int task5 () {
        System.out.println("Task 5:  Вывод соответствий между символами и их численными обозначениями в памяти компьютера");
        int sum = 0;
        for (int i = 33; i <= 255; i++) {
            System.out.println(i + " - " + (char)i + "\t");
        }
        return sum;
    }
}