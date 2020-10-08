package JavaFundamentals.OptionalTask1;

public class Task1 {
    public static void solutionTask1 (int[] array) {
        int minLength;
        int maxLength;
        int numberWithMinLength;
        int numberWithMaxLength;
        System.out.println("Task 1:");
        if (array != null && array.length > 0) {
            numberWithMinLength = numberWithMaxLength = array[0];
            minLength = maxLength = String.valueOf(array[0]).length();
        } else {
            System.out.println("No numbers entered");
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int len = String.valueOf(array[i]).length();
            if (len < minLength) {
                minLength = len;
                numberWithMinLength = array[i];
            }
            if (len > maxLength) {
                maxLength = len;
                numberWithMaxLength = array[i];
            }
        }
        System.out.println("Number with min length = " + numberWithMinLength + ", its length = " + minLength);
        System.out.println("Number with max length = " + numberWithMaxLength + ", its length = " + maxLength);
    }
}
