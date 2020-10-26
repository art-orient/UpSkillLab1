package Strings.ArrayOfCharacters;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        String[] camelCase = {"newArray", "oldMen", "mySilverCar", "firstMounting", "ourFamilyHouse", "consumerDOB"};
        System.out.println(Arrays.toString(camelCase));
        System.out.println(Arrays.toString(Task1.camelToSnake(camelCase)));

        System.out.println("\nTask 2:");
        String str2 = "One word, two words, three words, but wording or fourth word of words.";
        System.out.println(str2);
        System.out.println(Task2.makeLetter(str2));

        System.out.println("\nTask 3:");
        String str3 = "14654568.2cow34 orange35,7app8le76 45 - by47.806";
        System.out.println(str3);
        System.out.println("Number of digits = " + Task3.sumDigits(str3));

        System.out.println("\nTask 4:");
        System.out.println(str3);
        System.out.println("Number of numbers = " + Task4.sumNumbers(str3));
        String str4 = "1.";
        System.out.println(str4);
        System.out.println("Number of numbers = " + Task4.sumNumbers(str4));

        System.out.println("\nTask 5:");
        String str5 = "  It's   my    life 7   88  end    ";
        System.out.println(str5);
        System.out.println("result = [" + Task5.delSpace(str5) + "]");
    }
}
