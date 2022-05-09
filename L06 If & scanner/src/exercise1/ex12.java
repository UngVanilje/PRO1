package exercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv tre tal");
        int tal = scan.nextInt();
        int tal1 = scan.nextInt();
        int tal2 = scan.nextInt();


        if (tal1 > tal && tal2 > tal1)
        {
            System.out.println("Increasing");
        }
        else if (tal1 < tal || tal2 < tal1)
        {
            System.out.println("Decreasing");
        }
        else
        {
            System.out.println("Neither");
        }


        scan.close();


    }
}
