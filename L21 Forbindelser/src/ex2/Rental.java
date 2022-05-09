package ex2;

import java.util.ArrayList;

public class Rental {
    private int numb;
    private int days;
    private String date;
    private int price;
    final ArrayList<Car> cars = new ArrayList<>();

    public Rental(int numb, String date, int days){
        this.numb = numb;
        this.date = date;
        this.days = days;
    }

    public int getNumb() {
        return numb;
    }

    public String getDate() {
        return date;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public int getPrice(Car car) {
        int totalPrice = 0;
        totalPrice = car.getPricePerDay() * days;
        return totalPrice;
    }


    //-------------------------------------

    public ArrayList<Car> getCars(){
        return new ArrayList<>(cars);
    }
    /**
     * @param car is not connected to rental
     */
    public void addCar(Car car){
        cars.add(car);
        car.rentals.add(this);
    }

    /**
     * @param car is connected to rental
     */
    public void removeCar(Car car){
        cars.remove(car);
        car.rentals.remove(this);
    }

}
