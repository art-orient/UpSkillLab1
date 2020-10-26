package Strings.ArrayOfCharacters;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task1 {
    public static String[] camelToSnake (String[] names) {
        StringBuilder nameSnake = new StringBuilder();
        boolean isAbbreviation = false;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                char symbol = names[i].charAt(j);
                if (!isUpperCase(symbol)) {
                    nameSnake.append(symbol);
                } else {
                    if (j + 1 != names[i].length() && isUpperCase(names[i].charAt(j+1))) {
                        if (!isAbbreviation){
                            nameSnake.append('_');
                        }
                        isAbbreviation = true;
                    }
                    if (isAbbreviation){
                        nameSnake.append(symbol);
                    } else {
                        nameSnake.append('_');
                        nameSnake.append(toLowerCase(symbol));
                    }
                }
            }
            names[i] = nameSnake.toString();
            nameSnake.setLength(0);
        }
        return names;
    }
}
