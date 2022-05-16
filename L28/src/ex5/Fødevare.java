package ex5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fødevare extends Vare {
    private LocalDate duration;


    public Fødevare(String name, double price, String description, LocalDate duration) {
        super(name, price, description);
        this.duration = duration;
    }

    public LocalDate getDuration() {
        return duration.plusDays(7);
    }

    @Override
    public String toString() {
        return "Vare: " + getName() + "\n" + "Holdbar til d." + getDuration() +
                "\nPris: " + getPrice() + "kr,-" + "\nMoms hearaf: " + moms() + "kr,-" +
                "\nInfo" + getDescription() + ".\n";
    }

    @Override
    public double moms() {
        double moms = 0;
        moms = getPrice() * 0.05;
        return moms;
    }
}
