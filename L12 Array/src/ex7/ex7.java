package ex7;

import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        int [] tester = {10, 15, 12, 4, 1, 11, 24, 99};
        System.out.println(Arrays.toString(tester));
    }
    public static void test(int[] t){
        int sidste = t[t.length - 1];
        int første = t[0];
        t[t.length - 1] = første;
        t[0] = første;

    }
    public static void test1(int[] t1) {
        for (int i = 0; i < t1.length; i++) {
            if (i % 2 == 0) {
                t1[i] = 0;
            }
        }

    }
    public static int test2(int[] t2){
        for (int i = 0; i < t2.length; i++){

        }
        return '0';
    }
}
