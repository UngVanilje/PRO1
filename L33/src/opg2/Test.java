package opg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        System.out.println(linearSearchFile("personer", "Thomsen"));
    }
    public static String linearSearchFile(String fileName, String target) {
        boolean found = false;
        String person = "";
        File in = new File("L33/src/opg2/" + fileName);
        try (Scanner scanner = new Scanner(in)) {
            while (!found && scanner.hasNextInt()) {
                String k = scanner.nextLine();
                String[] str = k.split(" ");
                if (str[str.length - 1].equals(target)) {
                    found = true;
                    person = str[1] + " " + str[2];
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return person;
    }
}
