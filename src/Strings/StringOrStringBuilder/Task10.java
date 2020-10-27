package Strings.StringOrStringBuilder;
// 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
//  восклицательным или вопросительным знаком. Определить количество предложений в строке X.
public class Task10 {
    public static int sumSentence (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if ((symbol == '!' || symbol == '?' || symbol == '.')
                && (i+1 == str.length() || str.charAt(i+1) == ' ')){
                sum++;
            }
        }
        return sum;
    }
}
