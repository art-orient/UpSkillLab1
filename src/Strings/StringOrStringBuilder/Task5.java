package Strings.StringOrStringBuilder;
// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task5 {
    public static int findSumA (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                sum++;
            }
        }
        return sum;
    }
}