package ex3;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String address;

    private double hourlyPay;

    private ArrayList<Employee> employees;

    public Employee(String name, String address, double hourlyPay) {
        this.name = name;
        this.address = address;
        this.hourlyPay = hourlyPay;
    }

    public double weeklySalary() {
        return hourlyPay * 37;

    }

    public String getName() {
        return name;
    }
}
