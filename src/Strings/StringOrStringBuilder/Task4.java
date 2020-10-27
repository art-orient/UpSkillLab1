package Strings.StringOrStringBuilder;
// 4. С помощью функции копирования и операции конкатенации
// составить из частей слова “информатика” слово “торт”.
public class Task4 {
    public static StringBuilder makeCake (String str) {
        StringBuilder cake = new StringBuilder();
            int index = str.indexOf('т');
            cake.append(str.charAt(index));
            index = str.indexOf('о');
            cake.append(str.charAt(index));
            index = str.indexOf('р');
            cake.append(str.charAt(index));
            index = str.indexOf('т');
            cake.append(str.charAt(index));
        return cake;
    }
}
