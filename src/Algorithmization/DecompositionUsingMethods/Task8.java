package Algorithmization.DecompositionUsingMethods;
// 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
// элементов массива с номерами от k до m.
public class Task8 {
    public static int sum3elemArray (int[] array, int k){
        if (k + 2 < array.length){
        return array[k] + array[k+1] + array[k+2];
    } else {
            System.out.println("Введенное число k не позволяет выполнить вычисления!");
            return -1;
        }
    }
}
