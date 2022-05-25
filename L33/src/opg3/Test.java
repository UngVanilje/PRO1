package opg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Test {
    public static void main(String[] args) {


        fletAlleHeltal("tal1.txt","tal2.txt" , "samlet");
    }

    public static void fletAlleHeltal(String fileName1, String fileName2, String fileNameNy) {
        File file1 = new File("L33/src/opg3/tal1.txt");
        File file2 = new File("L33/src/opg3/tal2.txt");
        File newFile = new File("L33/src/opg3/Heltal.txt");

        try (Scanner scanner1 = new Scanner(file1);
             Scanner scanner2 = new Scanner(file2);
             PrintWriter writer = new PrintWriter(newFile)) {
            int k = scanner1.nextInt();
            int j = scanner2.nextInt();
            while (scanner1.hasNextInt() && scanner2.hasNextInt()) {
                    if (k < j) {
                        writer.println(k);
                        k = scanner1.nextInt();
                    }
                    else if (j < k) {
                        writer.println(j);
                        j = scanner2.nextInt();
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

