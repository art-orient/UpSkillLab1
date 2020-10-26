package Strings.ArrayOfCharacters;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        String[] camelCase = {"newArray", "oldMen", "mySilverCar", "firstMounting", "ourFamilyHouse"};
        System.out.println(Arrays.toString(camelCase));
        System.out.println(Arrays.toString(Task1.camelToSnake(camelCase)));

        System.out.println("\nTask 2:");
        String str2 = "One word, two words, three words, but wording or fourth word of words.";
        System.out.println(str2);
        System.out.println(Task2.makeLetter(str2));

    }
}
