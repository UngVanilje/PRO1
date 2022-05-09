package ex2;

import java.util.ArrayList;

public class Car {
    private String number;
    private String year;
    private int pricePerDay;
    ArrayList<Rental>  rentals =new ArrayList<>();

    public Car(String number, String year, int pricePerDay){
        this.number = number;
        this.year = year;
        this.pricePerDay = pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public String getNumber() {
        return number;
    }

    public String getYear() {
        return year;
    }

    //---------------------------------------

    public ArrayList<Rental> getRental() {
        return rentals;
    }

    public int rentalPeriod(){
        int longestPeriod = 0;
        for (int i = 0; i < rentals.size(); i++){
            if (longestPeriod < rentals.get(i).getDays()){
                longestPeriod = rentals.get(i).getDays();
            }
        }
        return longestPeriod;
    }
}
