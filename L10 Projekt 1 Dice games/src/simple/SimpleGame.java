package simple;

import java.util.Scanner;

public class SimpleGame {

    /**
     * Simulates playing one game of Simple.
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        DiceThrower thrower = new DiceThrower();

        boolean finished = false;
        while (!finished) {
            // TODO: Roll dice, print roll description.
            thrower.roll();
            thrower.rollDescription();
            System.out.println(thrower.rollDescription());

            System.out.println("Roll again? (Y/n) ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                finished = true;
            }
        }
        scanner.close();

        System.out.printf("\nResults:\n");
        System.out.printf("---------\n");
        // TODO: Print all the results:
        // roll count, total of all face values, average sum in one roll,
        System.out.printf("%30s \t\t\t\t %d\n", "Roll count:", thrower.getRollCount());
        System.out.printf("Total value: \t\t\t\t %d\n", thrower.getTotalValue());
        System.out.printf("Average sum: \t\t\t\t %d\n", thrower.getTotalValue() / thrower.getRollCount());
        // count of face value 6, count of same face value on both dice,
        System.out.printf("Amount of 6'ers rolled: \t %d\n", thrower.getSixCount());
        System.out.printf("Amount of same number rolls: %d\n", thrower.getSameCount());
        // max sum in one roll.
        System.out.printf("Max value in one roll: \t\t %d\n", thrower.getMax());
        // Use the method: System.out.printf().

    }

    /**
     * Prints the rules of Simple.
     */
    public void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Simple:");
        System.out.println("The player throws the 2 dice as long as he/she wants.");
        System.out.println("=====================================================");
    }

}
