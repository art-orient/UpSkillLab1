package Strings.StringOrStringBuilder;
// 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class Task7 {
    public static StringBuilder delDuplicates (String str) {
        str = str.replaceAll(" ", "");
        StringBuilder duplicate = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String strI = str.substring(i, i+1);
            if (duplicate.indexOf(strI) == -1){
                duplicate.append(strI);
            }
        }
        return duplicate;
    }
}
