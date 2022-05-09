package ex1;

public class BankAccount {
    // Defines balance type and sets it as a field so all methods in the class can access it
    private double balance;
    private int id;
    private static int lastID = 1001;

    // Holds balance and ID
    // Requires the balance set as a parameter and as a double
    // Sets the BA "balance" equals the field balance
    public BankAccount(double balance) {
        this.balance = balance;
        this.id = lastID;
        lastID++;
    }

    // Method for depositing money into BA
    // Amounts are never negative
    public void deposit(double amount) {
        balance += amount;
    }
    // Method for withdrawing money from BA
    // Balance can never be negative
    public void withdraw(double amount) {
        balance -= amount;
    }
    //Method to get current amount of $ on BA
    public double getBalance() {
        return balance;
    }
    private int getID(){
        return id;
    }
    //Returns id and balance as a string
    public String toString() {
        return "\nUser ID: " + id + "\nCurrent balance: " + balance;
    }

}
