package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fileUtil {

    public int max(String fileName){
        File in = new File("L32/src/ex5/" + fileName);
        int highest = 0;
        try (Scanner scanner = new Scanner(in)){
            while(scanner.hasNextInt()){
                int d = scanner.nextInt();
                if (highest < d){
                    highest = d;
                }
            }
            System.out.println("Highest number in file: " + highest);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return highest;
    }
    public int min(String fileName){
        File in = new File("L32/src/ex5/" + fileName);
        int lowest = 10000;
        try (Scanner scanner = new Scanner(in)){
            while(scanner.hasNextInt()){
                int d1 = scanner.nextInt();
                if (lowest > d1){
                    lowest = d1;
                }
            }
            System.out.println("Lowest number in file: " + lowest);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return lowest;
    }
    public double average(String fileName) throws IOException {
        File in = new File("L32/src/ex5/" + fileName);
        double sum = 0;
        int counter = 0;
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextDouble()) {
                double d = scanner.nextDouble();
                sum += d;
                counter++;
            }
            System.out.println("Total sum is " + sum);
            System.out.println("Average number is: " + sum / counter);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return sum / counter;
    }
}
