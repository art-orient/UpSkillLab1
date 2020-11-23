package BasicsOfOOP.Task3;
// Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию
// о выходных и праздничных днях.
public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.addDay(1, true, false);
        calendar.addDay(2);
        calendar.addDay(3);
        calendar.addDay(4);
        calendar.addDay(5);
        calendar.addDay(6);
        calendar.addDay(7, true, true);
        calendar.addDay(8, true, false);
        calendar.addDay(9);
        calendar.addDay(10);
        calendar.addDay(11);
        calendar.addDay(12);
        calendar.addDay(13);
        calendar.addDay(14, true, false);
        calendar.addDay(15, true, false);
        calendar.addDay(16);
        calendar.addDay(17);
        calendar.addDay(18);
        calendar.addDay(19);
        calendar.addDay(20);
        calendar.addDay(21, true, false);
        calendar.addDay(22, true, false);
        calendar.addDay(23, false, true);
        System.out.println(calendar);
    }
}
