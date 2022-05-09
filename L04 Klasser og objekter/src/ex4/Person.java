package ex4;

public class Person {
    private String name;
    private String address;
    private int monthlySalary;

    public Person(String name, String address, int monthlySalary) {
        this.name = name;
        this.address = address;
        this.monthlySalary = monthlySalary;
    }

    public String getName(){
    return name;
    }

    public void setAddress(String address) {
    this.address = address;
    }

    public String getAddress(){
    return address;
    }

    public void setmonthlySalary(int monthlySalary){
    this.monthlySalary = monthlySalary;
    }

    public int getmonthlySalary() {
    return monthlySalary;
    }}
