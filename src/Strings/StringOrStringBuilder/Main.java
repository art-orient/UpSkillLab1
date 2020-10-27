package Strings.StringOrStringBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        String str1 = "    It's     my        life 7   88     end     ";
        System.out.println(str1);
        System.out.println("result = " + Task1.maxSumSpace(str1));

        System.out.println("\nTask 2:");
        String str2 = "There are wild and domestic animals. Some animals are dangerous.";
        System.out.println(str2);
        System.out.println("result = " + Task2.addBpastA(str2));

        System.out.println("\nTask 3:");
        String str3 = "palindrome";
        System.out.println(str3);
        System.out.println("result = " + Task3.isPalindrome(str3));
        String str3pal = "redivider";
        System.out.println(str3pal);
        System.out.println("result = " + Task3.isPalindrome(str3pal));

        System.out.println("\nTask 4:");
        String str4 = "информатика";
        System.out.println(str4);
        System.out.println("result = " + Task4.makeCake(str4));

        System.out.println("\nTask 5:");
        System.out.println(str2);
        System.out.println("result = " + Task5.findSumA(str2));

        System.out.println("\nTask 6:");
        String str6 = "Domestic animals live at home or at the farm.";
        System.out.println(str6);
        System.out.println("result = " + Task6.twiceString(str6));

        System.out.println("\nTask 7:");
        String str7 = "abc cde def";
        System.out.println(str7);
        System.out.println("result = " + Task7.delDuplicates(str7));

        System.out.println("\nTask 8:");
        System.out.println(str2);
        System.out.println("result = " + Task8.maxLength(str2));

        System.out.println("\nTask 9:");
        String str9 = "abJGc GK GTD cde dFHKef";
        System.out.println(str9);
        System.out.println("Number small letters = " + Task9.smallLetters(str9));
        System.out.println("Number big letters = " + Task9.bigLetters(str9));

        System.out.println("\nTask 10:");
        String str10 = "I get up at seven o’clock. When do you get up? At seven! You remember it? Yes, it is.";
        System.out.println(str10);
        System.out.println("Number of sentences = " + Task10.sumSentence(str10));
    }
}
