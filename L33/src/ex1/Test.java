package ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Customer> customers1 = new ArrayList<>();

        Customer c1 = new Customer("Jørgen", "Olsen");
        Customer c2 = new Customer("Bente", "Bent");
        Customer c3 = new Customer("Katja", "Kaj");
        Customer c4 = new Customer("Alfons", "Åberg");
        Customer c5 = new Customer("Bjørnen", "Bjørn");
        Customer c6 = new Customer("Lars", "Sørensen");

        Customer c7 = new Customer("Karin", "Borup");
        Customer c8 = new Customer("Thomasine", "Laursen");
        Customer c9 = new Customer("Kaptajn", "Kødboller");
        Customer c10 = new Customer("Kristian", "Langkjer");
        Customer c11 = new Customer("Bodil", "Jakobsen");
        Customer c12 = new Customer("Henrik", "Ulriksen");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

        customers1.add(c7);
        customers1.add(c8);
        customers1.add(c9);
        customers1.add(c10);
        customers1.add(c11);
        customers1.add(c12);

        Collections.sort(customers);

        Collections.sort(customers1);

        System.out.println(mergeAll(customers, customers1));
    }
    public static ArrayList<Customer> mergeAll(ArrayList<Customer> l1, ArrayList<Customer> l2){
        ArrayList<Customer> result = new ArrayList<>();
        // flet sålænge der er noget i begge lister
        int i1 = 0;
        int i2 = 0;
        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) < 0) {
                // s1's tal er mindst
                result.add(l1.get(i1));
                i1++;
            }
            else {
                // s2's tal er mindst
                result.add(l2.get(i2));
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < l1.size()) {
            result.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()) {
            result.add(l2.get(i2));
            i2++;
        }
        return result;
    }
}
