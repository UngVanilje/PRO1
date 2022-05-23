package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("User Directory = " + System.getProperty("user.dir"));

        ArrayList<Integer> numbers = new ArrayList<>(); //ex2 del
        File in = new File("L32/src/ex1/Testeren.txt"); // use "/" or "\\", not "\"
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextLine()) {
                int number = scanner.nextInt();
                numbers.add(number);//ex2 del
                System.out.println(number * 2);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry! An unexpected error has occurred.");
            System.out.println("Technical message: " + ex.getMessage());
        }
        Collections.sort(numbers,Collections.reverseOrder());//ex2 del
        System.out.println("Reverse sorted arraylist : " + numbers);//ex2 del

    }
}
