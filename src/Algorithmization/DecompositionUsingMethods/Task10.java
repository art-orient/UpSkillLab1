package Algorithmization.DecompositionUsingMethods;
// 10. Дано натуральное число N. Написать метод(методы) для формирования массива,
// элементами которого являются цифры числа N.
public class Task10 {
    public static int[] arrayFromDigits (int n){
        int size = Integer.toString(n).length();
        int[] array = new int[size];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n%10;
            n = n / 10;
        }
    return array;
    }
}
