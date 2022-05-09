package ex1;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Billybob", "1502938947", "80336699");
        Person p2 = new Person("Nallan", "0709782369", "69696969");

        Dog d1 = p1.createDog(1, "Meatball");
        Dog d2 = new Dog(2, "Thomasine");
        Dog d3 = p2.createDog(69, "Porky");
        Dog d4 = new Dog(70, "Gassy");
        p1.addDog(d2);
        p2.addDog(d4);

        System.out.println("Dog owner #1 : " + p1.getName() + "\nTheir dog(s) are: " + p1.getDogs());
        System.out.println("\nDog owner #2 : " + p2.getName() + "\nTheir dog(s) are: " + p2.getDogs());
        System.out.println("------------------------------------------------------------------------------");

        p1.removeDog(d1);
        p2.removeDog(d4);
        p1.addDog(d4);
        p2.addDog(d1);

        System.out.println("\nDog owner #1 : " + p1.getName() + "\nTheir dog(s) after the exchange are: " + p1.getDogs());
        System.out.println("\nDog owner #2 : " + p2.getName() + "\nTheir dog(s) after the exchange are: " + p2.getDogs());
        System.out.println("--------------------------------------------------------------------------------");
    }
}
