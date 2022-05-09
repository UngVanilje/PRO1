package ex1;

import java.util.ArrayList;

public class Person {
    private String name;
    private String cpr;
    private String phone;

    public Person(String name, String cpr, String phone){
        this.name = name;
        this.cpr = name;
        this.phone = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return name;
    }

    //-------------------------------------

    // aggregation 0..1 --> 0..* Dog
    private final ArrayList<Dog> dogs = new ArrayList<>();

    public ArrayList<Dog> getDogs(){
        return new ArrayList<>(dogs);
    }

    public Dog createDog(int number, String name){
        Dog dog = new Dog(number, name);
        dogs.add(dog);
        dog.person = this;
        return dog;
    }

    /**
     * @param dog is not connected to person
     */
    public void addDog(Dog dog){
        dogs.add(dog);
        dog.person = this;
    }

    /**
     * @param dog is connected to person
     */
    public void removeDog(Dog dog){
        dogs.remove(dog);
        dog.person = this;
    }
}
