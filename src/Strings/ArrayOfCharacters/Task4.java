package Strings.ArrayOfCharacters;

import static java.lang.Character.isDigit;

// 4. В строке найти количество чисел.
public class Task4 {
    public static int sumNumbers (String str) {
        int sum = 0;
        boolean isDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                if (!isDigit) {
                    sum++;
                    isDigit = true;
                }
            } else {
                isDigit = false;
            }
            if (str.charAt(i) == '.' && i != 0 && isDigit(str.charAt(i-1))) {
                isDigit = true;
            }
        }
        return sum;
    }
}