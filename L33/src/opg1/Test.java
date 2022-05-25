package opg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        System.out.println("Findes tallet i filen?" + linearSearchFile("tal", 9140));
        System.out.println("Findes tallet i filen?" + linearSearchFile("tal", 8486));

    }

    public static boolean linearSearchFile(String fileName, int target) {
        boolean found = false;
        File in = new File("L33/src/opg1/" + fileName);
        try (Scanner scanner = new Scanner(in)) {
            while (!found && scanner.hasNextInt()) {
                int k = scanner.nextInt();
                if (k == target) {
                    found = true;
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return found;
    }
}
