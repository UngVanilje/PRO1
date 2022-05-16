package ex3;

public class Test {
    public static void main(String[] args) {
        int[] arr = {7, 9, 13, 7, 9, 13};
        int[] arr1 = {7, 9, 13, 13, 9, 7};
        int[] arr2 = {7, 9, 14, 13, 10, 8};

        System.out.println(SearchArray(arr));
        System.out.println(SearchArray(arr1));
        System.out.println(SearchArray1(arr));
        System.out.println(SearchArray1(arr1));
        System.out.println(SearchArray1(arr2));
    }
    public static boolean SearchArray(int[] arr) {
        boolean found = false;
        int i = 1;
        while (!found && i < arr.length) {
            int k = arr[i];
            if (k == arr[i-1])
                found = true;
            else
                i++;
        }
        return found;
    }
    public static boolean SearchArray1(int[] arr) {
        boolean found = false;
        int i = 1;
        int n = 0;
        while (!found && i < arr.length) {
            int k = arr[i];
            if (k == arr[i - (1 + n)]) //|| k == arr[i + (1 + n)]
                found = true;
            else
                i++;
            n++;
        }
        return found;
    }


}
