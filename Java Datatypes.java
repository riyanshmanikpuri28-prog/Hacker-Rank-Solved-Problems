import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger n = sc.nextBigInteger();

            if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 ||
                n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {

                System.out.println(n + " can't be fitted anywhere.");

            } else {
                System.out.println(n + " can be fitted in:");

                if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println("* byte");
                }

                if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    System.out.println("* short");
                }

                if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                }

                System.out.println("* long");
            }
        }

        sc.close();
    }
}
