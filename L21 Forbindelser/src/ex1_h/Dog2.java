package ex1_h;

public class Dog2 {
    private int number;
    private String name;
    Person2 person;

    public Dog2(int number, String name){
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

    public Person2 getPerson(){
        return person;
    }

    /**
     * @param person is not connected to person
     */
    public void addPerson(Person2 person){
        this.person = person;
        person.getDogs().add(this);
    }

    /**
     * @param person is connected to dog
     */
    public void removePerson(Person2 person){
        person.getDogs().remove(this);
        this.person = null;
    }
}


