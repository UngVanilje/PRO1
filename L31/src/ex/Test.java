package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        String[] strings1 = {"Black", "Red", "Blue", "Yellow", "Brown", "Green"};
        String[] strings2 = {"Dark blue", "Dark red", "Purple", "Pink", "Turquoise", "Cyan"};
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Customer> customers1 = new ArrayList<>();
        ArrayList<Customer> customers2 = new ArrayList<>();

        //Exercise 1 - Bubble sort
        strings.add("Black");
        strings.add("Red");
        strings.add("Blue");
        strings.add("Yellow");
        strings.add("Brown");
        strings.add("Green");

        System.out.println("\nBubble sorted: ");
        System.out.println("Unsorted list : " + strings);
        bubbleSort(strings);
        System.out.println("Sorted list: " + strings);
        System.out.println();
        System.out.println("------------------------------------------------");

        //----------------------------------------------------------------
        //Exercise 2 - Selection sort

        Customer c1 = new Customer("Lars", 24);
        Customer c2 = new Customer("Lasse", 16);
        Customer c3 = new Customer("Mads", 23);
        Customer c4 = new Customer("Karen", 33);
        Customer c5 = new Customer("Anna", 12);
        Customer c6 = new Customer("Anders", 2);

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

        System.out.println("Selection sorted: ");
        System.out.println("Unsorted array: " + Arrays.toString(strings1));
        selectionSortString(strings1);
        System.out.println("Sorted array: " + Arrays.toString(strings1));

        System.out.println("\nUnsorted arraylist: " + customers);
        SelectionSortList(customers);
        System.out.println("Sorted arraylist: " + customers);
        System.out.println("\n----------------------------------------------------");


        //----------------------------------------------------------------
        //Exercise 3 - Insertion sort

        Customer c7 = new Customer("Karsten", 24);
        Customer c8 = new Customer("Lasse", 16);
        Customer c9 = new Customer("Rene", 23);
        Customer c10 = new Customer("Majbrit", 33);
        Customer c11 = new Customer("Androgynes", 12);
        Customer c12 = new Customer("Zejer", 2);

        customers1.add(c7);
        customers1.add(c8);
        customers1.add(c9);
        customers1.add(c10);
        customers1.add(c11);
        customers1.add(c12);

        System.out.println("Insertion sorted: ");
        System.out.println("Unsorted array: " + Arrays.toString(strings2));
        insertionSort(strings2);
        System.out.println("Sorted array: " + Arrays.toString(strings2));
        System.out.println("\nUnsorted arraylist: " + customers1);
        insertionSortList(customers1);
        System.out.println("Sorted arraylist: " + customers1);
        //----------------------------------------------------------------
        //Exercise 4 - Timer test

        //Bubble sort
        long start = System.currentTimeMillis();
        Random r = new Random();
        int[] ints = r.ints(1000, 1, 10000).toArray();

        bubbleSortArray(ints);
        long end = System.currentTimeMillis();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Sort time with different methods");
        System.out.println("\nBubble sort time:");
        System.out.print(end - start);
        System.out.print(" milliseconds");
        System.out.println();

        //Selection sort
        long start1 = System.currentTimeMillis();
        Random r1 = new Random();
        int[] ints1 = r.ints(1000, 1, 10000).toArray();

        selectionSortArray(ints1);
        long end1 = System.currentTimeMillis();
        System.out.println("\nSelection sort time:");
        System.out.print(end1 - start1);
        System.out.print(" milliseconds");
        System.out.println();

        //Insertion sort
        long start2 = System.currentTimeMillis();
        Random r2 = new Random();
        int[] ints2 = r.ints(1000, 1, 10000).toArray();

        insertionSortArray(ints2);
        long end2 = System.currentTimeMillis();
        System.out.println("\nInsertion sort time:");
        System.out.print(end2 - start2);
        System.out.print(" milliseconds");
        System.out.println();

        //Collentions.sort
        long start3 = System.currentTimeMillis();
        Random r3 = new Random();
        int[] ints3 = r.ints(1000, 1, 10000).toArray();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        for (int e3 : ints3) {
            numbers3.add(e3);
        }
        Collections.sort(numbers3);
        long end3 = System.currentTimeMillis();
        System.out.println("\nCollection sort time:");
        System.out.print(end3 - start3);
        System.out.print(" milliseconds");
        System.out.println("\n----------------------------------------------------");

        //--------------------------------------------------------------
        //Exercise 5 Collections.sort

        Customer c13 = new Customer("Jørgen", 24);
        Customer c14 = new Customer("Børge", 16);
        Customer c15 = new Customer("Rasmus", 23);
        Customer c16 = new Customer("Kenneth", 33);
        Customer c17 = new Customer("Kasper", 12);
        Customer c18 = new Customer("Jesus", 2);

        customers2.add(c13);
        customers2.add(c14);
        customers2.add(c15);
        customers2.add(c16);
        customers2.add(c17);
        customers2.add(c18);

        System.out.println("\n Unsorted customers list: ");
        System.out.println(customers2); // print the list before sorting
        Collections.sort(customers2);
        System.out.println("\n Sorted customers list: ");
        System.out.println(customers2); // print the list after sorting
        //------------------------------------------------------------------
    }

    //Exercise 1 - Bubble sort
    public static void bubbleSort(ArrayList<String> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    //Integer array
    public static void bubbleSortArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //Exercise 2 - Selection sort

    //String version
    public static void selectionSortString(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[indexOfMin]) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                String temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
    }

    //Integer version
    public static void selectionSortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                int temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
    }

    public static void SelectionSortList(ArrayList<Customer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(indexOfMin)) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                Customer temp = list.get(i);
                list.set(i, list.get(indexOfMin));
                list.set(indexOfMin, temp);
            }

        }
    }

    //Exercise 3 - Insertion sort
    //String version
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            int j = i;
            while (j > 0 && temp.compareTo(arr[j - 1]) < 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    //Integer version
    public static void insertionSortArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void insertionSortList(ArrayList<Customer> list) {
        for (int i = 1; i < list.size(); i++) {
            Customer temp = list.get(i);
            int j = i;
            while (j > 0 && temp.compareTo(list.get(j - 1)) < 0) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, temp);
        }
    }
}
