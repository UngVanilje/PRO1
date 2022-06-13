package opg5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        AlleTal("tal1", "tal2", "AlleTal");
    }
    public static void AlleTal(String filename1, String filename2, String newFileName) {
        File file1 = new File("L33/src/opg5/tal1");
        File file2 = new File("L33/src/opg5/tal2");
        File newFile = new File("L33/src/opg5/AlleTal.txt");

        try (Scanner scanner1 = new Scanner(file1);
             Scanner scanner2 = new Scanner(file2);
             PrintWriter writer = new PrintWriter(newFile)) {
            int k = scanner1.nextInt();
            int j = scanner2.nextInt();
            while (scanner1.hasNextInt() && scanner2.hasNextInt()) {
                if (k < j) {
                    writer.println(k);
                    k = scanner1.nextInt();
                } else if (j < k) {
                    writer.println(j);
                    j = scanner2.nextInt();
                }
            }
            while (scanner1.hasNextInt()) {
                writer.println(k);
                k = scanner1.nextInt();
            }
            while (scanner2.hasNextInt()) {
                writer.println(j);
                j = scanner2.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
