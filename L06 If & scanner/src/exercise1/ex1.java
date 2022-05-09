package exercise1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hvad er tallet?");
        int tal = scan.nextInt();

        if (tal < 0)
        {
            System.out.println("Negativ");
        }
        else if (tal == 0)
        {
            System.out.println("Nul");
        }
        else if (tal > 0)
        {
            System.out.println("Positiv");
        }

        scan.close();


    }
}
