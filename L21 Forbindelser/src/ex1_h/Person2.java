package ex1_h;

import java.util.ArrayList;

public class Person2 {
    private String name;
    private String cpr;
    private String phone;
    private final ArrayList<Dog2> dogs = new ArrayList<>();


    public Person2(String name, String cpr, String phone){
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

    public ArrayList<Dog2> getDogs(){
        return new ArrayList<>(dogs);
    }



}
