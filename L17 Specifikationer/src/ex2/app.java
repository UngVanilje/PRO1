package ex2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class app {
    public static void main(String[] args) {
        rental r1 = new rental(1,365, 1.50, LocalDate.now().plusMonths(10));
        System.out.println("\nStart of rental nr. 1: " + r1.getStartDate());
        System.out.println("Total price for rental period: " + r1.getTotalPrice());
        System.out.println("Last day of rental: " + r1.getEndDate());
        System.out.println("Collect keys on the day before rental: " + r1.getStartDate().minusDays(1));
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------
        rental r2 = new rental(1, 251, 2.50, LocalDate.now().plusMonths(1).withDayOfMonth(1));
        System.out.println("\nStart of rental nr. 2: " + r2.getStartDate());
        System.out.println("Total price for rental period: " + r2.getTotalPrice());
        System.out.println("Last day of rental: " + r2.getEndDate());
        System.out.println("Collect keys on the day before rental: " + r2.getStartDate().minusDays(1));
        System.out.println("------------------------------------------------------------------------------");
        Period p = Period.between(r2.getEndDate(), r1.getStartDate());
        System.out.println("Time between rentals: " + p.getYears() + " Years " + p.getMonths() + " Months " +  p.getDays() + " Days");


    }
}
