package ex3;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        Customer[] customers1 = new Customer[6];

        Customer c1 = new Customer("Jørgen", "Olsen");
        Customer c2 = new Customer("Bente", "Bent");
        Customer c3 = new Customer("Katja", "Kaj");
        Customer c4 = new Customer("Alfons", "Åberg");
        Customer c5 = new Customer("Bjørnen", "Bjørn");
        Customer c6 = new Customer("Lars", "Sørensen");

        Customer c7 = new Customer("Karin", "Borup");
        Customer c8 = new Customer("Bente", "Bent");
        Customer c9 = new Customer("Kaptajn", "Kødboller");
        Customer c10 = new Customer("Katja", "Kaj");
        Customer c11 = new Customer("Bodil", "Jakobsen");
        Customer c12 = new Customer("Alfons", "Åberg");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

        customers1[0] = c7;
        customers1[1] = c8;
        customers1[2] = c9;
        customers1[3] = c10;
        customers1[4] = c11;
        customers1[5] = c12;

        System.out.println("\nUnsorted  good customerlist: " + customers);
        System.out.println("Unsorted bad customerlist: " + Arrays.toString(customers1));
        Collections.sort(customers);
        insertionSort(customers1);
        System.out.println("\nSorted good customerlist: " + customers);
        System.out.println("Sorted bad customerlist: " + Arrays.toString(customers1));

        System.out.println("\nActually good customerlist : " + goodCustomers(customers, customers1));


    }
    public static ArrayList<Customer> goodCustomers(ArrayList<Customer> s1, Customer[] s2){
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (i1 < s1.size() && i2 < s2.length) {
            if (s1.get(i1).compareTo(s2[i2]) < 0) {
                // s1's tal er mindst
                i1++;
            }
            else  if(s1.get(i1).compareTo(s2[i2]) > 0){
                // s2's tal er mindst
                i2++;
            }
            else if (s1.get(i1).compareTo(s2[i2]) == 0){
                result.add(s1.get(i1));
                i1++;
                j++;
            }
        }
        return result;
    }
    public static void insertionSort(Customer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Customer temp = arr[i];
            int j = i;
            while (j > 0 && temp.compareTo(arr[j - 1]) < 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}

