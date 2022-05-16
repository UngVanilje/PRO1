package ex3;

public class Mechanic extends Employee {
    private int apprenticeshipTest;
    private double hourlyPay;


    public Mechanic(String name, String address, int apprenticeshipTest, double hourlyPay) {
        super(name, address, hourlyPay);
        this.apprenticeshipTest = apprenticeshipTest;
        this.hourlyPay = hourlyPay;
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

    @Override
    public double weeklySalary() {
        return super.weeklySalary();
    }
}
