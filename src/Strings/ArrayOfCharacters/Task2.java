package Strings.ArrayOfCharacters;
// 2. Замените в строке все вхождения 'word' на 'letter'.
public class Task2 {
    public static String makeLetter(String str) {
        return str.replaceAll("word", "letter");
    }
}