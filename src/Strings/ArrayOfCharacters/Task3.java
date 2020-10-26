package Strings.ArrayOfCharacters;
// 3. В строке найти количество цифр.
public class Task3 {
    public static int sumDigits (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum++;
            }
        }
        return sum;
    }
}
