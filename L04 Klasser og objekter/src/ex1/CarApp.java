package ex1student;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("Volkswagen", "Sort", "BH 69.420");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Color: " + myCar.getColor());
        myCar.setKm(69420);
        System.out.println("Total Km: " + myCar.getKm());
        System.out.println("Regnr: " + myCar.getRegistrationNumber());

    }
}
