package ex1;

public class Beer implements Measureable{
    private String name;
    private double alcoholPercentage;

    public Beer(String name, double alcoholPercentage) {
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
    }

    public String getName() {
        return name;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    @Override
    public double getMeasureable() {
        return alcoholPercentage;
    }

    @Override
    public String toString() {
        return getName() + "\nAlcohol percentage: " + getMeasureable() + "%";
    }
}
