package MiniOrderSystem;

import java.time.LocalDate;
import java.time.Month;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Bobcat toy", 2000.00);
        Product p2 = new Product(2, "Car", 4000.00);
        Product p3 = new Product(3, "Truck-kun", 10000.00);
        Product p4 = new Product(4, "Apple", 2.00);
        Product p5 = new Product(5, "Pizza", 10.00);

        Customer c1 = new Customer("Kasper", LocalDate.of(1956, Month.JULY,16));
        Customer c2 = new Customer("Thomas", LocalDate.of(1986, Month.MAY,11));

        Order o1 = new Order(1);
        Order o2 = new Order(2);
        Order o3 = new Order(3);
        Order o4 = new Order(4);
        Order o5 = new Order(5);


        o1.createOrderLine(2,p1);
        o1.createOrderLine(1,p2);
        o2.createOrderLine(3,p4);
        o2.createOrderLine(4,p3);
        o3.createOrderLine(5,p4);
        o3.createOrderLine(3,p5);
        o4.createOrderLine(1,p1);
        o4.createOrderLine(2,p3);
        o5.createOrderLine(3,p4);
        o5.createOrderLine(1,p2);

        c1.addOrder(o1);
        c1.addOrder(o2);
        c2.addOrder(o3);
        c2.addOrder(o4);
        c2.addOrder(o5);

        System.out.println(o1.orderPrice());
        System.out.println("Customer name: " + c1.getName() + "\n" + "Total order price: " + c1.totalBuy() + "Kr,-");
        System.out.println("------------------------------------------");
        System.out.println("Customer name: " + c2.getName() + "\n" + "Total order price: " + c2.totalBuy() + "Kr,-");
    }
}

