package BasicsOfSoftwareCodeDevelopment.Cycles;

import java.math.BigDecimal;

/* 4. Составить программу нахождения произведения квадратов первых двухсот чисел..*/
public class Task4 {
    public static BigDecimal task4 () {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= 200; i++) {
            result = result.multiply(BigDecimal.valueOf(i * i));
        }
        return result;
    }
}
