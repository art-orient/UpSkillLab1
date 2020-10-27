package Strings.StringOrStringBuilder;
// 3. Проверить, является ли заданное слово палиндромом.
public class Task3 {
    public static boolean isPalindrome (String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}