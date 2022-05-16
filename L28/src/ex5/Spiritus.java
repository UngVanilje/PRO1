package ex5;

public class Spiritus extends Vare {
    private double alkPct;
    private static final int maxLimit = 90;
    private static final double minTax = 0.80;
    private static final double maxTax = 1.20;

    public Spiritus(String name, double price, String description, double alkPct) {
        super(name, price, description);
        this.alkPct = alkPct;
    }

    public double getAlkPct() {
        return alkPct;
    }

    @Override
    public String toString() {
        return "Vare: " + getName() + " - " + getAlkPct() + "%\n" +
                "Pris: " + getPrice() + "kr,-" +
                "\nMoms hearaf: " + moms() + "kr,-" +
                "\nInfo" + getDescription() + ".\n";
    }

    @Override
    public double moms() {
        double moms = 0;
        if (getPrice() > maxLimit) {
            moms = getPrice() * maxTax;
        } else {
            moms = getPrice() * minTax;
        }
        return moms;
    }
}
