package ex3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        player p1 = new player("Hans", 18, 69);
        player p2 = new player("Ole", 40, 38);
        player p3 = new player("Kim", 22, 69);
        player p4 = new player("Kaj", 36, 45);
        team t1 = new team("Viby Vikings");


        System.out.println("Player name: " + p1.getName() + "\nAge: " + p1.getAge() + "\nScore: " + p1.getScore());
        System.out.println("\nPlayer name: " + p2.getName() + "\nAge: " + p2.getAge() + "\nScore: " + p2.getScore());
        System.out.println("\nPlayer name: " + p3.getName() + "\nAge: " + p3.getAge() + "\nScore: " + p3.getScore());
        System.out.println("\nPlayer name: " + p4.getName() + "\nAge: " + p4.getAge() + "\nScore: " + p4.getScore());

        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        System.out.println("\nCurrent players on the team: ");
        t1.printPlayers();
        System.out.println("\nGennemsnitsalder: " + t1.averageAge());
        System.out.println("Total score of players older than 31: " + t1.calcOldPlayersScore(31));
        System.out.println("Total team score: " + t1.totalScore());
        p1.addScore(6);
        p2.addScore(2);
        p3.addScore(10);
        p4.addScore(7);
        System.out.println("Highest score so far: " + t1.maxScore());
        System.out.println("Best four players: " + t1.bestPlayerNames());



    }
}
