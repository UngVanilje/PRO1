package ex3;

public class player {
    private int age;
    private String name;
    private int score = 0;

    public player(String name, int age, int score){
        this.age = age;
        this.name = name;
        this.score = score;

    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setScore(int score){
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public void addScore(int addscore){
        score = score + addscore;
    }

}
