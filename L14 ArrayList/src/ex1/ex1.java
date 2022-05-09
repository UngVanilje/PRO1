package ex1;

import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hans");
        names.add("Viggo");
        names.add("Jens");
        names.add("Bente");
        names.add("Bent");
        System.out.println("Current ArrayList size: " + names.size());
        //4)
        names.add(2, "Jane");
        //5)
        System.out.println("\nNavne registreret pt.: " + names);
        //6)
        names.remove(1);
        //7)
        names.add(0, "Pia");
        //8)
        names.add(names.size(), "Ib");
        //9)
        System.out.println("\nOpdateret navneliste: " + names);
        //10)
        names.set(2, "Hansi");
        //11)
        System.out.println("\nListe igen: " + names);
        //12)
        //gjort i forrige
        //13)
        for (int i = 0; i < names.size(); i++)
        {
            String name = names.get(i);
            System.out.println("Name length; " + name.length());
        }
        //14)
        for (String name : names){
            System.out.println("Length of name: " + name.length());
        }
    }
}
