package ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Player[] players = new Player[6];
        ArrayList<Player> players1 = new ArrayList<>();

        Player p1 = new Player("Søren",1.80,75, 21);
        Player p2 = new Player("Karsten",1.65,65, 54);
        Player p3 = new Player("Per",1.82,80, 56);
        Player p4 = new Player("Lars",1.75,85, 66);
        Player p5 = new Player("Peter",1.75,70, 80);
        Player p6 = new Player("Jesper",1.95,90, 92);

        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
        players[3] = p4;
        players[4] = p5;
        players[5] = p6;

        players1.add(p1);
        players1.add(p2);
        players1.add(p3);
        players1.add(p4);
        players1.add(p5);
        players1.add(p6);


        System.out.println(findPlayerLinear(players, 56));
        System.out.println(findPlayerBinary(players1, 80));
        System.out.println("Spiller der passer med krav: " + findPlayerName(players1));
    }
    public static Player findPlayerLinear(Player[] players, int score) {
        Player player = null;
        int i = 0;
        while (player == null && i < players.length) {
            int p = (score);
            if (p == players[i].getScoredGoals())
                player = players[i];
            else
                i++;
        }
        return player;
    }

    public static Player findPlayerBinary(ArrayList<Player> players, int score) {
        Player player = null;
        int left = 0;
        int right = players.size() - 1;
        while (player == null && left <= right) {
            int middle = (left+right) / 2;
            Player p = players.get(middle);
            if (p.getScoredGoals() == score)
                player = p;
            else if (p.getScoredGoals() == score && score > 0)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return player;
    }
    public static String findPlayerName(ArrayList<Player> players){
        String player = "";
        int i = 0;
        while (player.equals("") && i < players.size()) {
            if (players.get(i).getHeight() < 1.70 && players.get(i).getScoredGoals() >= 50)
                player = players.get(i).getName();
            else
                i++;
        }
        return player;
    }

}
