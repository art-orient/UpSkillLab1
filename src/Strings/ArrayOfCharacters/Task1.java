package Strings.ArrayOfCharacters;
// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task1 {
    public static String[] camelToSnake (String[] names) {
        StringBuilder nameSnake = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                char symbol = (char) names[i].charAt(j);
                if (symbol < 'A' || symbol > 'Z') {
                    nameSnake.append(symbol);
                } else {
                    nameSnake.append('_');
                    nameSnake.append(symbol + 32);
                }
            }
            names[i] = nameSnake.toString();
            nameSnake.setLength(0);
        }
        return names;
    }
}
