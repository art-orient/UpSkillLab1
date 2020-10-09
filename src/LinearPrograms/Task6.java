package LinearPrograms;
// 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//    принадлежит закрашенной области, и false — в противном случае: (смотри рисунок)
public class Task6 {
    public static boolean task6 (int x, int y) {
        if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) ||
                ((x >= -4 && x <= 4 && y >= -3 && y <= 0) && !(x == 0 && y == -1))) {
            return true;
        } else {
            return false;
        }
    }
}
