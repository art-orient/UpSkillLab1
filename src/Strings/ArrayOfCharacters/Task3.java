package Strings.ArrayOfCharacters;

import static java.lang.Character.isDigit;

// 3. В строке найти количество цифр.
public class Task3 {
    public static int sumDigits (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }
}
