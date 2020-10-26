package Strings.ArrayOfCharacters;
// 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.
public class Task5 {
    public static String delSpace (String str) {
        return str.strip().replaceAll("\\s+", " ");
    }
}