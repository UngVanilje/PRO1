package ex4;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Figur> figurs = new ArrayList<>();

        Rektangel r1 = new Rektangel(2, 4, 4, 3);
        Rektangel r2 = new Rektangel(4, 7, 44, 69);
        Cirkel c1 = new Cirkel(10, 14, 8);
        Cirkel c2 = new Cirkel(15, 18, 11);
        Kvadrat k1 = new Kvadrat(9, 17, 6);
        Kvadrat k2 = new Kvadrat(22, 24, 15);
        Ellipse e1 = new Ellipse(34, 34, 8, 2);
        Ellipse e2 = new Ellipse(40, 44, 20, 14);

        figurs.add(r1);
        figurs.add(r2);
        figurs.add(c1);
        figurs.add(c2);
        figurs.add(k1);
        figurs.add(k2);
        figurs.add(e1);
        figurs.add(e2);


        double totalArea = 0;
        for (Figur f : figurs) {
            f.forskyd(10, 20);
            System.out.println(f);
            System.out.println();
            totalArea += f.area();
        }
        System.out.println("Total area: " + totalArea);


    }
}
