package ex3;

import java.util.ArrayList;

public class team {
    private String name;
    private ArrayList<player> p;

    public team(String name) {
        this.name = name;
        p = new ArrayList<>();
    }

    public ArrayList<player> getP() {
        return p;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(player p1) {
        p.add(p1);
    }

    public void printPlayers() {
        for (player e : p) {
            System.out.println("Name: " + e.getName());
            System.out.println("Age: " + e.getAge());
            System.out.println("Score: " + e.getScore());
        }

    };

    public double averageAge() {
        double age = 0;
        for (player e : p) {
            age += e.getAge();
        }
        return age / p.size();
    }

    public int totalScore() {
        int sum = 0;
        for (player e : p) {
            sum += e.getScore();
        }
        return sum;
    }

    public int calcOldPlayersScore(int ageLimit) {
        int sum = 0;
        for (player e : p) {
            if (ageLimit < e.getAge()) {
                sum += e.getScore();
            }
        }
        return sum;
    }
    public int maxScore() {
        int max = 0;
        for (player e : p) {
            if (e.getScore() < e.getScore()) {
                max = e.getScore();
            }
        }
        return max;
    }
    public ArrayList<String> bestPlayerNames(){
        ArrayList<String> player2 = new ArrayList<>();
        int maxScore = maxScore();
        for (player e : p){
            if (e.getScore() == maxScore){
                player2.add(e.getName());
            }
        }
        return player2;
    }

}



