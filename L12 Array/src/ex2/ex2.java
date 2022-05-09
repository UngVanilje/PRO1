package ex2;

import java.security.PublicKey;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] testArray = {7, 2, 9, 5, 6, 7, 4,};
        double[] testArray2 = {10.4, 42.5, 4.1, 6.7};
        System.out.println(sum(testArray));
        System.out.println(sum1(testArray2));
    }

    public static int sum(int[] t) {
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];

        }
        return sum;
    }

    public static double sum1(double[] t1) {
        double sum1 = 0;
        for (int i = 0; i < t1.length; i++) {
            sum1 += t1[i];

        }
        return sum1;
    }
}
