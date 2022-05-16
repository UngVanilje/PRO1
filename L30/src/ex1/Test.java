package ex1;

public class Test {
    public static void main(String[] args) {

        int [] arr = {8,10, 6, 4, 2, 12, 14, 15 };
        System.out.println(linearSearchArray(arr));
    }
    public static boolean linearSearchArray(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            int k = arr[i];
            if (arr[i] % 2 != 0)
                found = true;
            else
                i++;
        }
        return found;
    }


}
