package com.UpSkillLab1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input 5 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int[] array = {number1, number2, number3, number4, number5};
        System.out.println("Your numbers are: " + Arrays.toString(array));
        Task1.solutionTask1(array);
    }
}
