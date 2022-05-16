package ex3;

public class Foreman extends Employee {
    private int appForeman;
    private double sSupplement;

    private double hourlyPay;

    public Foreman(String name, String address, int appForeman, double hourlyPay, double sSupplement) {
        super(name, address, hourlyPay);
        this.appForeman = appForeman;
        this.sSupplement = sSupplement;
        this.hourlyPay = hourlyPay;
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
    public double weeklySalary() {
        return super.weeklySalary() + sSupplement;
    }
}
