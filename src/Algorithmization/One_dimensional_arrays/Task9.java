package Algorithmization.One_dimensional_arrays;
// 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class Task9 {
    public static int mostCommonNumber(int[] array) {
        int commonNumber = array[0];
        int maxCounter = 1;
        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                commonNumber = array[i];
            } else if (counter == maxCounter) {
                commonNumber = Math.min(commonNumber, array[i]);
            }
        }
        return commonNumber;
    }
}
