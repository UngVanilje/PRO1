package ex3;

public class Customer implements Comparable<Customer> {
    private String name;
    private String lastName;

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    @Override
    public int compareTo(Customer secondCustomer) {
        if (this.name.compareTo(secondCustomer.name) < 0)
            return -1;

        else if (this.name.compareTo(secondCustomer.name) > 0) {
            return 1;
        }
        else if(this.lastName.compareTo(secondCustomer.lastName) < 0) {
            return -1;

        }
        else if (this.lastName.compareTo(secondCustomer.lastName) > 0) {
            return 1;
        }
        else
        return 0;
    }
    }
