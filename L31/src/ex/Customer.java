package ex;

public class Customer implements Comparable<Customer> {
    private String name;
    private int amountOfVares;

    public Customer(String name, int amountOfVares) {
        this.name = name;
        this.amountOfVares = amountOfVares;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfVares() {
        return amountOfVares;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Customer secondCustomer) {
        if (this.name.compareTo(secondCustomer.name) < 0)
            return -1;

        else if (this.name.compareTo(secondCustomer.name) > 0) {
            return 1;
        } else
            return 0;
    }
}
