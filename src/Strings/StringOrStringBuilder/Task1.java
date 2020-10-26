package Strings.StringOrStringBuilder;
// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task1 {
    public static String maxSumSpace (String str) {
        str = str.strip();
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i+1) == ' ') {
                continue;
            } else {
                space.append(str.charAt(i));
            }
        }
        return space.toString();
    }
}
