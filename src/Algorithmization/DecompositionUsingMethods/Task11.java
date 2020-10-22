package Algorithmization.DecompositionUsingMethods;
// 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Task11 {
    public static int moreDigits (int x, int y) {
        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }
        int lengthX = Integer.toString(x).length();
        int lengthY = Integer.toString(y).length();
        if (lengthX > lengthY) {
            return x;
        } else if (lengthY > lengthX) {
            return y;
        } else {
            return 0;
        }
    }
}

