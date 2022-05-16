package ex3;

public class Surveyor extends Mechanic {

    private int inspections;

    public Surveyor(String name, String address, int apprenticeshipTest, double hourlyPay, int inspections) {
        super(name, address, apprenticeshipTest, hourlyPay);
        this.inspections = inspections;
    }

    @Override
    public double weeklySalary() {
        return super.weeklySalary() + (29 * inspections);
    }
}
