package ex1;

public class Dog {
    private int number;
    private String name;
    Person person;

    public Dog(int number, String name){
        this.number = number;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return name;
    }

    //-----------------------------------------------------

    // aggregation --> 0..1 Group

    public Person getPerson(){
        return person;
    }
}


