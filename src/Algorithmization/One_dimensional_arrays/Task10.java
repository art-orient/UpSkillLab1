package Algorithmization.One_dimensional_arrays;
// 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями).
public class Task10 {
    public static void awayEverySecondItem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
