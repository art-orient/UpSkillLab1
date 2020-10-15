package LinearPrograms;
// 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:  ННч ММмин SSc.
//
public class Task5 {
    public static String task5 (int t) {
        int hour = t / 3600;
        int minutes = t % 3600 / 60;
        int sec = t % 60;
        String time = String.format("%dч %dмин %dс", hour, minutes, sec);
        return time;
    }
}
