package ex1;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int [][] array = {
                {0, 4, 3, 9, 6},
                {1, 3, 5, 2, 2},
                {3, 3, 1, 0, 1},
                {0, 0, 9, 7, 1}
        };
        print(array);
        System.out.println("Samlet sum af rækken: " + sumRow(array, 2));
        System.out.println("Samlet sum af kolonnen: " + sumColumn(array, 3));
        System.out.println("Samlet sum af alle kolonner og rækker: " + sum(array));
    }
    public static void print(int[][] array){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.printf("%d ", array[row][col]);
            }
            System.out.println();
        }
    }

    public static int getValueAt(int[][] numbers, int row, int col) {
        return numbers[row][col];
    }

    public void setValueAt(int[][] numbers, int row, int col, int value) {
        numbers[row][col] = value;
    }
    public static int sumRow(int[][] numbers, int row){
        int sum = 0;
        for (int col = 0; col < numbers[row].length; col++){
            sum = sum + numbers[row][col];
        }
        return sum;
    }
    public static int sumColumn(int[][] numbers, int col){
        int sum = 0;
        for (int row = 0; row < numbers.length; row++){
            sum = sum + numbers[row][col];
        }
        return sum;
    }
    public static int sum(int [][] numbers){
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum = sum + numbers[row][col];
            }
        }
        return sum;
    }
}
