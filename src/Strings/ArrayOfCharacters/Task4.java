package Strings.ArrayOfCharacters;
// 4. В строке найти количество чисел.
public class Task4 {
    public static int sumNumbers (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if (i+1 == str.length() || (str.charAt(i+1) < '0' || str.charAt(i+1) > '9')
                        && str.charAt(i+1) != '.') {
                    sum++;
                }
            }
        }
        return sum;
    }
}