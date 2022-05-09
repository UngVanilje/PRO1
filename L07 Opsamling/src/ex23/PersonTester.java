package ex23;

public class PersonTester {

    public static void main(String[] args) {
        // Ex. 2
        Person p1 = new Person("Ib", 2000, 10, 6);
        p1.printPerson();
        System.out.println("Ib's alder i år: " + p1.calcAge(2069, 20, 26));

        Person p2 = new Person("Bob", 1969, 9, 20);
        p2.printPerson();;
        System.out.println(("Bob's alder i år: " + p2.calcAge(2030, 12,3 )));
        System.out.println("This year is a leap year, " + p2.leapYear(2064

        ));
    }

}
