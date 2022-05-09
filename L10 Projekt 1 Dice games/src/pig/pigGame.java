package pig;

import java.util.Scanner;

public class pigGame {
    private boolean nextPlayer = false;
    private boolean finished = false;
    Player p1 = new Player();
    Player p2 = new Player();
    Scanner scanner = new Scanner(System.in);
    DiceThrower thrower = new DiceThrower();
    private Player currentPlayer = p1;
    private int numberOfRounds = 0;


    public void play() {
        printRules();

        System.out.println("Enter the name player 1: ");
        p1.setPlayerName(scanner.nextLine());
        System.out.println("\nEnter the name player 2: ");
        p2.setPlayerName(scanner.nextLine());

        while (!finished) {
            takeTurn();
            if (p1.getTotalPoint() >= 100 || p2.getTotalPoint() >= 100) {
                finished = true;
                changePlayer();
                System.out.println("\nCongratulations " + currentPlayer.getPlayerName() + " you have won this round\n");
                currentPlayer.setWonGames(currentPlayer.getWonGames() + 1);
                System.out.println(p1.getPlayerName() + " has won: " + p1.getWonGames() + " games\n");
                System.out.println(p2.getPlayerName() + " has won: " + p2.getWonGames() + " games\n");
                System.out.println("Average number of throws this round: " + thrower.getTotalValue() / numberOfRounds);
                System.out.println("\nAverage number of points per round: " + (p1.getTotalPoint() + p2.getTotalPoint()) / numberOfRounds);

            }
            System.out.println("Do you want to play again? (Y/n)\n");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                finished = true;
            } else {
                finished = false;
                thrower.setRollCount(0);
                thrower.setTotalValue(0);
                numberOfRounds = 0;
                changePlayer();
            }
        }
        scanner.close();

    }

    public void takeTurn() {
        nextPlayer = false;
        while (!nextPlayer) {

            System.out.println("\nPlayer " + currentPlayer.getPlayerName() + " please roll the dice");
            String answer1 = scanner.nextLine();
            thrower.roll1();
            System.out.println("\nYou rolled: " + thrower.getFaceValue());
            if (thrower.getFaceValue() == 1) {

                System.out.println("\nToo bad you rolled 1 and lost all your points this turn, get better lol");
                System.out.println("\nYou currently have " + currentPlayer.getTotalPoint() + " points");
                changePlayer();
            } else {
                currentPlayer.setRundePoint(currentPlayer.getRundePoint() + thrower.getFaceValue());
                System.out.println("\nYour points this round: " + currentPlayer.getRundePoint());
                System.out.println("\nIf you stop now your total points will be: " + (currentPlayer.getTotalPoint() + currentPlayer.getRundePoint()));
                System.out.println("\nDo you want to continue rolling? (Y/n)\n");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    currentPlayer.updateTotal();
                    changePlayer();
                }


            }
            numberOfRounds++;
        }
    }

    public void play2() {
        printRules();

        System.out.println("Enter the name player 1: ");
        p1.setPlayerName(scanner.nextLine());
        System.out.println("\nEnter the name player 2: ");
        p2.setPlayerName(scanner.nextLine());

        while (!finished) {
            takeTurn2();
            if (p1.getTotalPoint() >= 100 || p2.getTotalPoint() >= 100) {
                finished = true;
                changePlayer();
                System.out.println("\nCongratulations " + currentPlayer.getPlayerName() + " you have won this round\n");
                currentPlayer.setWonGames(currentPlayer.getWonGames() + 1);
                System.out.println(p1.getPlayerName() + " has won: " + p1.getWonGames() + " games\n");
                System.out.println(p2.getPlayerName() + " has won: " + p2.getWonGames() + " games\n");
                System.out.println("Average number of throws this round: " + thrower.getTotalValue() / numberOfRounds);
                System.out.println("\nAverage number of points per round: " + (p1.getTotalPoint() + p2.getTotalPoint()) / numberOfRounds);

                System.out.println("Do you want to play again? (Y/n)\n");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    finished = true;
                } else {
                    finished = false;
                    thrower.setRollCount(0);
                    thrower.setTotalValue(0);
                    numberOfRounds = 0;
                    changePlayer();
                }
            }
        }
        scanner.close();

    }

    public void takeTurn2() {
        nextPlayer = false;
        while (!nextPlayer) {

            System.out.println("\nPlayer " + currentPlayer.getPlayerName() + " please roll the dice");
            String answer1 = scanner.nextLine();
            thrower.roll2();
            System.out.println("\nYou rolled: " + thrower.rollDescription2());
            if (thrower.getDie1().getFaceValue() == 1 && thrower.getDie2().getFaceValue() == 1) {
                currentPlayer.setTotalPoint(0);
                System.out.println("\nToo bad you rolled 1 and lost all your points, get better lol");
                System.out.println("\nYou currently have " + currentPlayer.getTotalPoint() + " points");
                changePlayer();
            } else if (thrower.getDie1().getFaceValue() == 1 || thrower.getDie2().getFaceValue() == 1) {
                currentPlayer.setRundePoint(0);
                changePlayer();
                System.out.println("You rolled one and therefore it's now " + currentPlayer.getPlayerName() + "'s turn");
            } else if (thrower.getDie1().getFaceValue() == thrower.getDie2().getFaceValue()) {
                System.out.println("\n You rolled: " + thrower.rollDescription2());
                currentPlayer.setRundePoint((currentPlayer.getRundePoint()) + thrower.getSum());
                System.out.println("\nYour points this round: " + currentPlayer.getRundePoint());
                System.out.println("\nStarting next roll automatically ( •̀ᴗ•́ )و ̑̑");
            } else {
                currentPlayer.setRundePoint(currentPlayer.getRundePoint() + thrower.getSum());
                System.out.println("\nYour points this round: " + currentPlayer.getRundePoint());
                System.out.println("\nIf you stop now your total points will be: " + (currentPlayer.getTotalPoint() + currentPlayer.getRundePoint()));
                System.out.println("\nDo you want to continue rolling? (Y/n)\n");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    currentPlayer.updateTotal();
                    changePlayer();
                }
            }
            numberOfRounds++;
        }
    }

    public void printRules() {
        System.out.println("\nRules of pig " +
                "\nThe game is played by two players.The players take turns, throwing one die until he / she throws 1," +
                "\nor until he/she decides to stop throwing. The player accumulates points (the face value of the die)" +
                "\non each throw,but if he / she throws 1, all points in this turn is lost.If the player stops before" +
                "\nthrowing a 1, the points of this turn is added to the points of earlier turns.The player that reaches" +
                "\n100 points after a turn, is the winner \n");
    }

    public void changePlayer() {
        currentPlayer.setRundePoint(0);
        if (currentPlayer == p1) {
            currentPlayer = p2;
        } else {
            currentPlayer = p1;
        }
        nextPlayer = true;
    }
}