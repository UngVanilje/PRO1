package ex4;

public class ex4 {
    public static void main(String[] args) {
        int[] testArray = {8, 2, 10, 6, 6, 8, 3,};
        int[] testArray1 = {8, 2, 10, 6, 6, 8, 2,};
        double[] testArray2 = {10.4, 42.5, 4.1, 6, 7};
        System.out.println(sum(testArray));
        System.out.println(sum1(testArray2));
        System.out.println(hasUneven(testArray));
        System.out.println(hasUneven(testArray1));
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

    //OPGAVE 4
    public static boolean hasUneven(int[] t2) {
        boolean hasUneven = false;
        for (int i = 0; i < t2.length; i++) {
            if (t2[i] % 2 > 0) {
                hasUneven = true;
            }

        }
        return hasUneven;

    }
}
