package ex2student;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    /**
     * Tests all the methods.
     */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);

//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sum1(ints);
        System.out.println("Sum: " + total);

        // Test of sum() method: correct sum is 61.
        int total1 = sum2(ints);
        System.out.println("Sum med for each: " + total1);

        // Test of minimum() method: correct minimum is -16.
        int lowestNumber = minNumber(ints);
        System.out.println("Lowest number in ArrayList: " + lowestNumber);

        // Test of maximum() method: correct maximum is 45.
        int highestNumber = maxNumber(ints);
        System.out.println("Highest number in ArrayList: " + highestNumber);

        // Test of average() method: correct average is 7.625.
        double averageNumber = medianNumber(ints);
        System.out.print("Average number for each element: ");
        System.out.printf("%.3f", averageNumber);

        // Test of zeroes() method: correct number of zeroes is 2.
        int numberOfZeroes = zeroes(ints);
        System.out.println("\nNumber of zeroes in ArrayList: " + numberOfZeroes);


        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        ArrayList<Integer> evenNumbers = evens(ints);
        System.out.println("Even numbers in Array: " + evenNumbers);

    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }

    public static int sum2(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static int minNumber(ArrayList<Integer> list) {
        int minNu = 0;
        for (int number : list) {
            if (minNu > number)
                minNu = number;
        }
        return minNu;
    }

    public static int maxNumber(ArrayList<Integer> list) {
        int maxNu = 0;
        for (int number : list) {
            if (maxNu < number) {
                maxNu = number;
            }
        }
        return maxNu;
    }

    public static double medianNumber(ArrayList<Integer> list) {
        double sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum / (list.size());
    }

    public static int zeroes(ArrayList<Integer> list) {
        int nuzero = 0;
        for (int number : list) {
            if (number == 0) {
                nuzero++;
            }
        }
        return nuzero;
    }
    public static ArrayList<Integer> evens(ArrayList<Integer> list){
        ArrayList<Integer> ints2 = new ArrayList<>();
        for (int number : list){
            if (number % 2 == 0){
                ints2.add(number);
            }
        }
        return ints2;

    }
}
