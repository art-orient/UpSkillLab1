package Algorithmization.DecompositionUsingMethods;
// 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не больше N.
public class Task12 {
    public static int[] formArray12 (int k, int n) {
        int[] arrayA = new int[n/2];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (sumDigits(i) == k){
                arrayA[count] = i;
                count++;
            }
        }
        int[] array = new int[count];
        System.arraycopy(arrayA, 0, array, 0, array.length);
        return array;
    }

    public static int sumDigits (int x) {
        int sum = 0;
        while (x != 0){
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
