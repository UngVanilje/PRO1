package opg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        findFællesTal("filename1", "filename2", "fællestal");

    }
    public static void findFællesTal(String filename1, String filename2, String newFileName) {
        File file1 = new File("L33/src/opg4/filename1");
        File file2 = new File("L33/src/opg4/filename2");
        File newFile = new File("L33/src/opg4/fællestal.txt");

        try (Scanner scanner1 = new Scanner(file1);
             Scanner scanner2 = new Scanner(file2);
             PrintWriter writer = new PrintWriter(newFile)) {
            int k = scanner1.nextInt();
            int j = scanner2.nextInt();
            int b = 0;
            while (scanner1.hasNextInt() && scanner2.hasNextInt()) {
                if (k == j) {
                    writer.println(k);
                    k = scanner1.nextInt();
                    j = scanner2.nextInt();
                }
                else if(j < k){
                    j = scanner2.nextInt();
                }
                else {
                    k = scanner1.nextInt();
                }
            }
            while (scanner1.hasNextInt()){
                writer.println(k);
                k = scanner1.nextInt();
            }
            while (scanner2.hasNextInt()){
                writer.println(j);
                j = scanner2.nextInt();
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
