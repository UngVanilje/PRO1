package ex1;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        //a
        int[] array1 = new int[10];
        System.out.println("A) " + Arrays.toString(array1));
        //b
        int[] array2 = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        System.out.println("B) " + Arrays.toString(array2));
        //c

        int[] array3 = new int[10];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = i;
        }
        System.out.println("C) " + Arrays.toString(array3));
        //d

        int[] array4 = new int[10];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = 2 * i + 2;
        }
        System.out.println("D) " + Arrays.toString(array4));
        //e
        int[] array5 = new int[10];
        int yeet = 1;
        for (int i = 0; i < array5.length; i++) {
            array5[i] += Math.pow(yeet, 2);
            yeet++;
        }
        System.out.println("E) " + Arrays.toString(array5));
        //f
        int u = 1;
        int[] array6 = new int[10];
        for (int i = 0; i < array6.length; i++) {
            if (i % 2 == 0) {
                array6[i] = 0;
            } else {
                array6[i] = 1;
            }
        }
        System.out.println("F) " + Arrays.toString(array6));
        //g
        int[] array7 = new int[10];
        int a = 0;
        for (int i = 0; i < array7.length; i++) {
            if (a > 4) {
                a = 0;
            }
            array7[i] = a;
            a++;
        }
        System.out.println("G) " + Arrays.toString(array7));
        //h
        int[] array8 = new int[10];
        int l = 0;
        for (int i = 0; i < 10; i++) {
            array8[i] = 2 * i + i % 2;
        }
        System.out.println("H) " + Arrays.toString(array8));
    }
}
