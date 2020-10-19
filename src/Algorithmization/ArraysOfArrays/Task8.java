package Algorithmization.ArraysOfArrays;

import java.util.Scanner;

/** 8. В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца
 *  поставить на соответствующие им позиции другого, а элементы второго переместить в первый.
 *  Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task8 {
    public static int[][] changeColumns (int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номера первого и второго столбцов, подлежащих замене:");
        int numberFirstColumn = scanner.nextInt();
        int numberSecondColumn = scanner.nextInt();
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == numberFirstColumn) {
                    int temp = array[i][j];
                    array[i][j] = array[i][numberSecondColumn];
                    array[i][numberSecondColumn] = temp;
                }
            }
        }
        return array;
    }
}
