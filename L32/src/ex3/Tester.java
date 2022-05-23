package ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        File out = new File("L32/src/ex2/Output.txt");

        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(out)) {
            System.out.println("Positive uneven number under 100: ");
            boolean finished = false;
            while (!finished) {
                try {
                    for (int i = 1; i < 100; i += 2){
                        System.out.println(i);
                        writer.println(i);
                        if (i == 99){
                            finished = true;
                        }
                    }

                } catch (InputMismatchException ex) {
                    System.out.println("Positive uneven number under 100!");
                    System.out.println();
                    scanner.nextLine();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("End of program ");
    }
}
