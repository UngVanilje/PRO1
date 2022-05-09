package ex1;

import java.time.LocalDateTime;

public class Foreman extends Mechanic{
    private int appForeman;
    private double sSupplement;

    public Foreman(String name, String address, int apprenticeshipTest, double hourlyPay, int appForeman, double sSupplement) {
        super(name, address, apprenticeshipTest, hourlyPay);
        this.appForeman = appForeman;
        this.sSupplement = sSupplement;
    }

    public int getAppForeman() {
        return appForeman;
    }

    public void setAppForeman(int appForeman) {
        this.appForeman = appForeman;
    }

    public double getsSupplement() {
        return sSupplement;
    }

    public void setsSupplement(double sSupplement) {
        this.sSupplement = sSupplement;
    }

    @Override
    public double weeklySalary(){
        return super.weeklySalary() + sSupplement;
    }

}
