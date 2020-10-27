package Strings.StringOrStringBuilder;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

// 9. Посчитать количество строчных (маленьких) и прописных (больших) букв
// в введенной строке. Учитывать только английские буквы.
public class Task9 {
    public static int smallLetters (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isLowerCase(str.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }
    public static int bigLetters (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isUpperCase(str.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }
}
