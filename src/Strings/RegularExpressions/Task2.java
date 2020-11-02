package Strings.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
// (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
// Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
public class Task2 {
    static Pattern start = Pattern.compile("<[^/].*?>");
    static Pattern end = Pattern.compile("\\w+?\\b");
    public static void analizator (String str){
        Matcher matcherStart = start.matcher(str);
        int count = 0;
        while (matcherStart.find()){
            System.out.printf("Узел № %d:\n", count);
            System.out.println("Открывающий тег: " + matcherStart.group());
            String endTag = getTagEnd(matcherStart.group());
            System.out.println("Закрывающий тег: " + endTag);
            int indexEnd = str.indexOf(endTag, matcherStart.end());
            if (indexEnd >= 0) {
                String body = str.substring(matcherStart.end(), indexEnd);
                System.out.println("Тело тега: " + body);
            } else {
                System.out.println("Тег без тела");
            }
            count++;
        }
    }

    private static String getTagEnd (String tag){
        if (Pattern.matches("<\\w+?\\b/>", tag)){
            return tag;
        }
        Matcher matcherEnd = end.matcher(tag);
        if (matcherEnd.find()){
            return "</" + matcherEnd.group() + ">";
        } else {
            return "";
        }
    }
}
