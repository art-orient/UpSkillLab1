package Strings.ArrayOfCharacters;
// 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.
public class Task5 {
    public static String delSpace (String str) {
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