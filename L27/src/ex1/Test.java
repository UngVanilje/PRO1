package ex1;

import java.lang.invoke.MethodHandle;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Mechanic me1 = new Mechanic("Morten","Skimmelvænget", 2002, 100);
        Mechanic me2 = new Mechanic("Kasper","Bullervej", 2001, 102);
        Mechanic me3 = new Mechanic("Morten","Futtoget", 2006, 120);
        Mechanic me4 = new Mechanic("Bobba","Bumletinget", 1997, 150);
        Mechanic me5 = new Mechanic("Morten Paderewski","Ugleborgvej", 2003, 101);

        Foreman f1 = new Foreman("Karl","Opadvej", 1997, 100, 2000, 400);
        Foreman f2 = new Foreman("Kurl","Nedadvej", 1992, 103, 2002, 300);
        Foreman f3 = new Foreman("Kerl","Tilhøjrevej", 1995, 102, 2001, 350);

        Surveyor s1 = new Surveyor("Merl", "Mumlevej", 1996, 125, 240);

        ArrayList<Mechanic> mechanics = new ArrayList<>();

        mechanics.add(me1);
        mechanics.add(me2);
        mechanics.add(me3);
        mechanics.add(me4);
        mechanics.add(me5);
        mechanics.add(f1);
        mechanics.add(f2);
        mechanics.add(f3);
        mechanics.add(s1);
         for (Mechanic m : mechanics){
             System.out.println("Weekly salary for: " + m.getName()+ " = " + m.weeklySalary() + "$");
         }
        System.out.println("The weekly total earned across all mechanics: " + totalWeeklySalary(mechanics) + "$");
    }
    public static double totalWeeklySalary(ArrayList<Mechanic> liste){
        double totalWeekly = 0;
        for (Mechanic mechanic : liste){
            totalWeekly += mechanic.weeklySalary();
        }
        return totalWeekly;
    }
}
