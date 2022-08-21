package controller;

import model.Deltagelse;
import model.Fag;
import model.Lektion;
import model.Studerende;
import storage.Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Controller {

    public static Fag opretFag(String navn, String klasse){
        Fag fag = new Fag(navn,klasse);
        Storage.storeFag(fag);
        return fag;
    }
    public static Lektion opretLektion(LocalDate dato, LocalTime startTid, String lokale, Fag fag){
        Lektion lektion = new Lektion(dato,startTid,lokale);
        fag.addLektioner(lektion);
        Storage.storeLektion(lektion);
        return lektion;
    }

    public static Studerende opretStuderende(String navn, String email){
        Studerende studerende = new Studerende(navn,email);
        Storage.storeStuderende(studerende);
        return studerende;
    }

    public static void initStorage(){
        Fag f1 = Controller.opretFag("PRO1", "20S");
        Fag f2 = Controller.opretFag("PRO1", "20T");
        Fag f3 = Controller.opretFag("SU1","20S");

        Lektion l1 = Controller.opretLektion(LocalDate.of(2021, 2, 1), LocalTime.of(8, 30),"A1.32",f1);
        Lektion l2 = Controller.opretLektion(LocalDate.of(2021, 2, 1), LocalTime.of(10, 30),"A1.32",f1);
        Lektion l3 = Controller.opretLektion(LocalDate.of(2021, 2, 3), LocalTime.of(8, 30),"A1.32",f1);
        Lektion l4 = Controller.opretLektion(LocalDate.of(2021, 2, 3), LocalTime.of(10, 30),"A1.32",f1);

        Studerende s1 = Controller.opretStuderende("Peter Hansen", "ph@stud.dk");
        Studerende s2 = Controller.opretStuderende("Tina Jensen", "tj@stud.dk");
        Studerende s3 = Controller.opretStuderende("Sascha Petersen", "sp@stud.dk");

        Controller.opretDeltagelser(f1, s1);
        Controller.opretDeltagelser(f1, s2);
        Controller.opretDeltagelser(f1,s3);



    }

    public static void opretDeltagelser(Fag fag, Studerende studerende){
        for(Lektion lektion : fag.lektioner){
           Deltagelse d1 = lektion.createDeltagelse();
           d1.addStuderende(studerende);
        }
    }
    public ArrayList<Studerende> studerendeTilObservation(int grænse){
        ArrayList<Studerende> stud = new ArrayList<>();
        for(Studerende studerende : Storage.getStuderende()){
            if(studerende.antalFraværsLektioner() > grænse)
                stud.add(studerende);
                }
        Collections.sort(stud);
        return stud;

    }
    public static void fraværOmgængere(String[] omgængere, ArrayList<Studerende> megetFravær, String filnavn) throws RuntimeException{
        File out = new File("2021/src/controller/Controller");

        try (PrintWriter writer = new PrintWriter("Output.txt")) {
            int i1 = 0;
            int i2 = 0;

            while (i1 < omgængere.length && i2 < megetFravær.size()) {
                if (omgængere[i1].compareTo((megetFravær.get(i2).getNavn())) < 0) {
                    i1++;
                } else if (omgængere[i1].compareTo(megetFravær.get(i2).getNavn()) > 0) {
                    i2++;
                }
            else
                writer.println(megetFravær.get(i2));
                i1++;
                i2++;

            }
        }
        catch (FileNotFoundException e){
            e.getStackTrace();

        }
    }
}


