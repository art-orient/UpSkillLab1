package Strings.StringOrStringBuilder;
// 2. В строке вставить после каждого символа 'a' символ 'b'.
public class Task2 {
    public static String addBpastA (String str) {
        StringBuilder strWithB = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                strWithB.append("ab");
            } else {
                strWithB.append(str.charAt(i));
            }
        }
        return strWithB.toString();
    }
}
