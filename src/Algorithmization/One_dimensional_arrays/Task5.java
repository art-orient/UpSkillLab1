package Algorithmization.One_dimensional_arrays;
// 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void printMoreThanI (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i + 1) {
                System.out.print(array[i] +" ");
            }
        }
        System.out.println();
    }
}
