package Branching;
// 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task3 {
    public static String task3(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
            return "Точки расположены на одной прямой";
        } else if ((x1 == x2 && y1 == y2) || (x2 == x3 && y2 == y3) || (x1 == x3 && y1 == y3)) {
            return "Точки расположены на одной прямой";
        } else if ((x3 - x1) * (y2 - y1) == (x2 - x1) * (y3 - y1)) {
           return "Точки расположены на одной прямой";
        } else {
           return "Точки не находятся на одной прямой";
        }
    }
}