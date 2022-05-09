package ex2;

public class Test {
    public static void main(String[] args) {

        Rental r1 = new Rental(69,"9/11", 72);
        Rental r2 = new Rental(103, "11/11", 121);

        Car c1 = new Car("635","2022",2);
        r1.addCar(c1);
        Car c2 = new Car("9", "2019", 3);
        r2.addCar(c2);
        r1.getPrice(c1);
        r2.getPrice(c2);

        c1.rentalPeriod();
        c2.rentalPeriod();

        System.out.println("\nRental deal #1 info: " + "\nCar #" + r1.getNumb() + "\nDate of rental: " + r1.getDate() + "\nDuration: " + r1.getDays() + " days");
        System.out.println("Longest rental of this car: " + c1.rentalPeriod());
        System.out.println("Total price for rental: " + r1.getPrice(c1) + "$");
        System.out.println("\n------------------------------------------------------------");
        System.out.println("\nRental deal #2 info: " + "\nCar #" + r2.getNumb() + "\nDate of rental: " + r2.getDate() + "\nDuration: " + r2.getDays() + " days");
        System.out.println("Longest rental of this car: " + c2.rentalPeriod());
        System.out.println("Total price for rental: " + r2.getPrice(c2) + "$");
    }
}
