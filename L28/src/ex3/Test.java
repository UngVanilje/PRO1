package ex3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Mechanic me1 = new Mechanic("Morten", "Skimmelvænget", 2002, 100);
        Mechanic me2 = new Mechanic("Kasper", "Bullervej", 2001, 102);
        Mechanic me3 = new Mechanic("Morten", "Futtoget", 2006, 120);
        Mechanic me4 = new Mechanic("Bobba", "Bumletinget", 1997, 150);
        Mechanic me5 = new Mechanic("Morten Paderewski", "Ugleborgvej", 2003, 101);

        Foreman f1 = new Foreman("Karl", "Opadvej", 1997, 400, 100);
        Foreman f2 = new Foreman("Kurl", "Nedadvej", 1992, 300, 85);
        Foreman f3 = new Foreman("Kerl", "Tilhøjrevej", 1995, 350, 90);

        Surveyor s1 = new Surveyor("Merl", "Mumlevej", 1996, 125, 240);

        WorkingBoy w1 = new WorkingBoy("Lars", "Yesvej", 100);
        WorkingBoy w2 = new WorkingBoy("Bobby", "Kongevej", 125);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(me1);
        employees.add(me2);
        employees.add(me3);
        employees.add(me4);
        employees.add(me5);
        employees.add(f1);
        employees.add(f2);
        employees.add(f3);
        employees.add(s1);
        employees.add(w1);
        employees.add(w2);


        for (Employee e : employees) {
            System.out.println("Weekly salary for: " + e.getName() + " = " + e.weeklySalary() + "$");
        }
        System.out.println("The weekly total earned across all mechanics: " + totalWeeklySalary(employees) + "$");
    }

    public static double totalWeeklySalary(ArrayList<Employee> liste) {
        double totalWeekly = 0;
        for (Employee employee : liste) {
            totalWeekly += employee.weeklySalary();
        }
        return totalWeekly;
    }
}
