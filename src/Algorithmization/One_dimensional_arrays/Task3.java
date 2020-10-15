package Algorithmization.One_dimensional_arrays;
// 3. Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
public class Task3 {
        public static void solution (double[] array) {
            int counterMinus = 0;
            int counterNull = 0;
            int counterPlus = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    counterPlus++;
                } else if (array[i] < 0) {
                    counterMinus++;
                } else {
                    counterNull++;
                }
            }
            System.out.printf("Отрицательных элементов - %d, положительных - %d, нулевых - %d",
                    counterMinus, counterPlus, counterNull);
        }
    }