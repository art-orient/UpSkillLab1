package Algorithmization.ArraysOfArrays;

import java.util.Scanner;

/** 8. В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца
 *  поставить на соответствующие им позиции другого, а элементы второго переместить в первый.
 *  Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task8 {
    public static int[][] changeColumns (int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номера первого и второго столбцов, подлежащих замене.");
        System.out.println("Допустимые цифры от 0 до " + (array[0].length - 1) + ".");
        int numberFirstColumn = scanner.nextInt();
        int numberSecondColumn = scanner.nextInt();
        if (numberFirstColumn >= array[0].length || numberSecondColumn >= array[0].length) {
            System.out.println("Неправильно введены номера столбцов. Пожалуйста, запустите программу заново.");
            return null;
        }
        for (int i = 0; i < array.length; i++) {
                int temp = array[i][numberFirstColumn];
                array[i][numberFirstColumn] = array[i][numberSecondColumn];
                array[i][numberSecondColumn] = temp;
        }
        return array;
    }
}
