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
    }
}
