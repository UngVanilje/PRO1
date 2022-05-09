package ex2;

import java.time.LocalDate;
import java.time.Period;

public class rental {
    private int number;
    private Period days;
    private LocalDate startDate;
    private double price;

    public rental(int number, int days, double price, LocalDate startDate) {
        this.number = number;
        this.price = price;
        this.startDate = startDate;
        this.days = Period.ofDays(days);
    }


    public void setDays(int days) {
        this.days = Period.ofDays(days);
    }

    public int getDays() {
        return this.days.getDays();
    }

    public double getPricePrDay() {
        return price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate(){
        return startDate.plusDays(days.getDays()) ;
    }
    public double getTotalPrice(){
        return price * days.getDays();
    }

}
