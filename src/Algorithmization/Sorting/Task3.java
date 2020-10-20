package Algorithmization.Sorting;

// 3. Реализуйте сортировку обменами.
public class Task3 {
    public static int[] sortBubble (int[] array) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            boolean isSort = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    isSort = false;
                }
            }
            if (isSort) {
                break;
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("BubbleSort = " + (finish - start) + " ms");
        return array;
    }
// ниже - только для себя, использую для обратной сортировки и сравнения разных способов сортировки
//    public static int[] sortBubbleDesc (int[] array) {
//        long startDesc = System.currentTimeMillis();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < array.length - i; j++) {
//                if (array[j] > array[j-1]) {
//                    int temp = array[j];
//                    array[j] = array[j-1];
//                    array[j-1] = temp;
//                }
//            }
//        }
//        long finishDesc = System.currentTimeMillis();
//        System.out.println("BubbleSortDesc = " + (finishDesc - startDesc) + " ms");
//        return array;
//    }
}