package ex5;

import java.util.ArrayList;

public class Indkøbskurv {
    private ArrayList<Vare> vares;


    public Indkøbskurv() {
        vares = new ArrayList<>();
    }

    double totalAmount = 0;

    public void reciept() {
        for (Vare v : vares) {
            System.out.println(v);
            totalAmount += v.getPrice();
        }
        System.out.println("Total: " + totalAmount);
    }

    public void addVare(Vare vare) {
        vares.add(vare);
    }
}
