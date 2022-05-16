package ex4;

public class Player {
    private String name;
    private double height;
    private double weight;
    private int scoredGoals;

    public Player(String name, double height, double weight, int scoredGoals) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.scoredGoals = scoredGoals;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    @Override
    public String toString() {
        return "Player:" +
                "\nName: " + name  +
                "\nHeight: " + height + "cm" +
                "\nWeight: " + weight + "kg" +
                "\nScored goals: " + scoredGoals + "\n";
    }
}
