package ex1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Mechanic extends Person{
    private int apprenticeshipTest;
    private double hourlyPay;

    public Mechanic(String name, String address, int apprenticeshipTest, double hourlyPay) {
        super(name, address);
        this.apprenticeshipTest = apprenticeshipTest;
        this.hourlyPay = hourlyPay;
    }

    public double weeklySalary(){
         return hourlyPay * 37;

    }

    public int getApprenticeshipTest() {
        return apprenticeshipTest;
    }

    public void setApprenticeshipTest(int apprenticeshipTest) {
        this.apprenticeshipTest = apprenticeshipTest;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

}
