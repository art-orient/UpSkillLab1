package JavaFundamentals.OptionalTask1;

public class Task1 {
    public static int minLength;
    public static int maxLength;
    public static int numberWithMinLength;
    public static int numberWithMaxLength;
    public static void solutionTask1 (int[] array) {
        System.out.println("Task 1:");
        if (array.length > 0) {
            numberWithMinLength = numberWithMaxLength = array[0];
            minLength = maxLength = String.valueOf(array[0]).length();
        } else {
            System.out.println("No numbers entered");
        }
        for (int i = 1; i < array.length; i++) {
            if (String.valueOf(array[i]).length() < minLength) {
                minLength = String.valueOf(array[i]).length();
                numberWithMinLength = array[i];
            }
            if (String.valueOf(array[i]).length() > maxLength) {
                maxLength = String.valueOf(array[i]).length();
                numberWithMaxLength = array[i];
            }
        }
        System.out.println("Number with min length = " + numberWithMinLength + ", its length = " + minLength);
        System.out.println("Number with max length = " + numberWithMaxLength + ", its length = " + maxLength);
    }
}
