package ex2;

public class Test {
    public static void main(String[] args) {
        int[] list = {7, 56, 34, 3, 7, 14, 13, 4};

        System.out.println(linearSearchList(list));
    }
    public static int linearSearchList(int[] list) {
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i < list.length) {
            if (list[i] > 10 && list[i] < 15)
                indeks = i;
            else
                i++;
        }
        return list[i];
    }
}
