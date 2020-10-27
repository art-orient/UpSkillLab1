package Strings.StringOrStringBuilder;

import java.util.Arrays;

// 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class Task8 {
    public static String maxLength (String str) {
        str = str.replaceAll("\\p{Punct}", "");
        String longWord = "";
        int maxLength = 0;
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLength){
                maxLength = array[i].length();
                longWord = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        return longWord;
    }
}