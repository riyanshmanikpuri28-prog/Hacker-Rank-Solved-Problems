import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        String india = String.format(Locale.US, "%,.2f", payment);
        String china = String.format(Locale.US, "%,.2f", payment);
        String france = String.format(Locale.US, "%,.2f", payment)
                .replace(",", "TEMP")
                .replace(".", ",")
                .replace("TEMP", "\u00A0");

        System.out.println("US: " + us.format(payment));
        System.out.println("India: Rs." + india);
        System.out.println("China: \uFFE5" + china);
        System.out.println("France: " + france + " \u20AC");

        sc.close();
    }
}
