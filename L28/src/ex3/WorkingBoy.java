package ex3;

public class WorkingBoy extends Employee {


    private double hourlyPay;


    public WorkingBoy(String name, String address, double hourlyPay) {
        super(name, address, hourlyPay);
        this.hourlyPay = hourlyPay;
    }

    @Override
    public double weeklySalary() {
        return hourlyPay * 25;
    }

}
