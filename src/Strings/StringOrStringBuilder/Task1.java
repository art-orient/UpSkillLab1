package Strings.StringOrStringBuilder;
// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task1 {
    public static int maxSumSpace (String str) {
        int sum = 0;
        int maxSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sum++;
                if (sum > maxSpace) {
                    maxSpace = sum;
                }
            } else {
                sum = 0;
            }
        }
        return maxSpace;
    }
}
