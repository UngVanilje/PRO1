package ex5;

public class Vare {
    private String name;
    private double price;
    private String description;

    public Vare(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double moms() {
        double moms = 0;
        moms = price * 0.25;
        return moms;
    }

    public String toString() {
        return "Vare: " + getName() + "\n" + "Pris: " + getPrice() + "kr,-" +
                "\nMoms hearaf: " + moms() + "kr,-" + "\nInfo: " + getDescription() + ".\n";
    }
}
