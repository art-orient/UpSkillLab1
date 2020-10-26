package Strings.ArrayOfCharacters;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        String[] camelCase = {"newArray", "oldMen", "mySilverCar", "firstMounting", "ourFamilyHouse"};
        System.out.println(Arrays.toString(camelCase));
        System.out.println(Arrays.toString(Task1.camelToSnake(camelCase)));

        System.out.println("\nTask 2:");
    }
}
