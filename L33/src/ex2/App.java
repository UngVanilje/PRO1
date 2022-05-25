package ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10,12,14};
        int[] numbers1 = {1,2,4,5,6,9,12,17};

        System.out.println(Arrays.toString(sharedNumbers(numbers, numbers1)));

    }

    public static int[] sharedNumbers (int[] s1, int[] s2){
        int[] result = new int[s1.length + s2.length];
        // flet sålænge der er noget i begge arrays
        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (i1 < s1.length && i2 < s2.length) {
            if (s1[i1] < s2[i2]) {
                // s1's tal er mindst
                i1++;
            }
            else  if(s1[i1] > s2[i2]){
                // s2's tal er mindst
                i2++;
            }
            else if (s1[i1] == s2[i2]){
                result[j] = s1[i1];
                i1++;
                j++;
            }
        }
        // tøm det array der ikke er tomt
        while (i1 < s1.length) {
            result[j] = (s1[i1]);
            i1++;
            j++;
        }
        while (i2 < s2.length) {
            result[j] = (s2[i2]);
            i2++;
            j++;
        }
        int[] total = new int[j];
        System.arraycopy(result, 0, total, 0, j);

        return total;
    }

}
