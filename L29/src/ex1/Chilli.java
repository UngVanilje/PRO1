package ex1;

public class Chilli implements Measureable {
    private String name;
    private int spice;

    public Chilli(String name, int spice) {
        this.name = name;
        this.spice = spice;
    }

    public String getName() {
        return name;
    }

    public int getSpice() {
        return spice;
    }

    @Override
    public double getMeasureable() {
       int Scoville = spice;
        return Scoville;
    }

    @Override
    public String toString() {
        return getName() + "\nSpice level: " + getMeasureable() + " Scoville";
    }
}
