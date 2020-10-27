package Strings.StringOrStringBuilder;

import Strings.ArrayOfCharacters.Task5;

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
    }
}
