package ex3;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int[] arrayA = {7, 10, 22, 4, 6, 6};
        int[] arrayB = {7, 12, 2, 55, 1, 7};
        int[] arrayC = {7, 10, 2, 22, 11, 11, 19};
        System.out.println("Ny array: " + Arrays.toString(sumArrays(arrayA, arrayB)));
        System.out.println("Ny array: " + Arrays.toString(sumArrays2(arrayA, arrayC)));

    }

    public static int[] sumArrays(int[] arrayA, int[] arrayB) {

        int[] sumArrays = new int[6];
        for (int i = 0; i < 6; i++) {
            sumArrays[i] += arrayA[i] + arrayB[i];

        }
        return sumArrays;
    }

    public static int[] sumArrays2(int[] arrayA, int[] arrayC) {

        int[] sumArrays2;
        if (arrayA.length < arrayC.length) {
            sumArrays2 = arrayC;
        } else {
            sumArrays2 = arrayA;
        }

        int[] arrayD = new int[sumArrays2.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayD[i] += arrayA[i];
        }
        for (int i = 0; i < arrayC.length; i++) {
            arrayD[i] += arrayC[i];
        }
        return arrayD;
    }

}
