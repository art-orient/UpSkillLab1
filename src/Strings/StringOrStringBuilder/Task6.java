package Strings.StringOrStringBuilder;
// 6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Task6 {
    public static StringBuilder twiceString (String str) {
        StringBuilder twice = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            twice.append(symbol).append(symbol);
            }
        return twice;
    }
}
