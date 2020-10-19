package Algorithmization.ArraysOfArrays;
// 11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
public class Task11 {
    public static void find3by5() {
    StringBuilder numbersLOfLines = new StringBuilder();
    int[][] array11 = new int[10][20];
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                array11[i][j] = (int) (Math.random() * 16);
                System.out.print(array11[i][j] + "\t");
                if (array11[i][j] == 5) {
                    count++;
                }
            }
            if (count > 2) {
                numbersLOfLines = numbersLOfLines.append(i + " ");
            }
            System.out.println();
        }
        if (numbersLOfLines.length() > 0) {
            System.out.println("Номера строк, в которых число 5 встречается три и более раз - " + numbersLOfLines.toString());
        } else {
            System.out.println("Нет строк, в которых число 5 встречается три и более раз.");
        }
    }
}
