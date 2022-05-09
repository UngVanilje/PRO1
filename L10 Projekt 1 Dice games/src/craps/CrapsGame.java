package craps;

import java.util.Scanner;

public class CrapsGame {

    /**
     * Simulates playing one game of craps.
     */
    private boolean won = false;
    private boolean lost = false;
    private int firstThrow;
    private int wonGames;
    private int lostGames;

    public void play() {
        // TODO
        printRules();
        Scanner scanner = new Scanner(System.in);
        DiceThrower thrower = new DiceThrower();

        boolean finished = false;
        while (!finished) {
            while (!finished) {
                // TODO: Roll dice, print roll description.
                System.out.println("Roll the dice");
                String answer = scanner.nextLine();
                thrower.roll();
                System.out.println(thrower.rollDescription());
                System.out.println("\nYou rolled: " + thrower.sum());

                if (thrower.sum() == 7 || thrower.sum() == 11) {
                    won = true;
                    finished = true;
                } else if (thrower.sum() == 2 || thrower.sum() == 3 || thrower.sum() == 12) {
                    lost = true;
                    finished = true;
                } else {
                    firstThrow = thrower.sum();
                }


                while (!finished) {
                    System.out.println("\nRoll again");
                    answer = scanner.nextLine();
                    thrower.roll();
                    System.out.println(thrower.rollDescription());
                    System.out.println("\nYou rolled: " + thrower.sum());

                    if (firstThrow == thrower.sum()) {
                        won = true;
                        finished = true;
                    } else if (thrower.sum() == 7) {
                        lost = true;
                        finished = true;
                    }
                }
            }
            if (won == true) {
                printGameWon();
                wonGames++;
            } else if (lost == true) {
                printGameLost();
                lostGames++;
            }
            System.out.println("You have won " + wonGames + " times\n");
            System.out.println("You have lost " + lostGames + " times\n");
            if (lostGames > wonGames) {
                System.out.println("Git gud nub\n");
            } else if (wonGames > lostGames) {
                System.out.println("You're actually a legend for winning this much, try going to a casino\n");
            }
            System.out.println("Do you want to play again? (Y/n)\n");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                finished = true;
            } else {
                finished = false;
                won = false;
                lost = false;
            }
        }
        scanner.close();
    }

    /**
     * Prints a 'You have won' message.
     */
    public void printGameWon() {
        // TODO
        System.out.println("\nCongratulations you've won the game! ＼(＾O＾)／");
    }

    /**
     * Prints a 'You have lost' message.
     */
    public void printGameLost() {
        // TODO
        System.out.println("\nYou have lost the game! ╭∩╮(･◡･)╭∩╮\n");
    }

    /**
     * Prints the rules of craps.
     */
    public void printRules() {
        // TODO
        System.out.println("Rules of Craps\n" +
                "In the game a player throws 2 dice. The first throw is called 'the come out roll'. The player wins, if\n" +
                "the sum of the dice in the come out roll is 7 or 11. The player loses, if the sum is 2, 3 or 12. If the\n" +
                "sum is something else (that is, 4, 5, 6, 8, 9 or 10), the sum is set as the player's 'point'. The player\n" +
                "will now continue throwing the dice until he has lost or won. A sum equal his 'point' is a win, and a\n" +
                "sum equal 7 is a loss.\n");

    }

}
