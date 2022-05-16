package ex5;

public class El_artikler extends Vare {
    private double nrgiPrHour;


    public El_artikler(String name, double price, String description, double nrgiPrHour) {
        super(name, price, description);
        this.nrgiPrHour = nrgiPrHour;
    }

    public double getNrgiPrHour() {
        return nrgiPrHour;
    }

    @Override
    public String toString() {
        return "Vare: " + getName() + "\nwH: " + getNrgiPrHour() + "\nPris: " + getPrice() + "kr,-" +
                "\nMoms hearaf: " + moms() + "kr,-" + "\nInfo" + getDescription() + ".\n";
    }

    @Override
    public double moms() {
        double moms = 0;
        if (getPrice() < 9) {
            moms = 3;
        } else {
            moms = getPrice() * 0.30;
        }
        return moms;
    }
}
