package controller;

import model.Antal;
import model.Funktion;
import model.Medarbejder;
import model.Vagt;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Controller {
    public static Medarbejder opretMedarbejder(String navn, int antalTimerPrDag, LocalTime typiskMødetid){
        Medarbejder medarbejder = new Medarbejder(navn,antalTimerPrDag, typiskMødetid);
        Storage.storeMedarbejder(medarbejder);
        return medarbejder;
    }
    public static Vagt opretVagter(String navn, LocalDateTime tidFra, LocalDateTime tidTil, Funktion funktion, Medarbejder medarbejder){
        Vagt vagt = new Vagt(navn,tidFra,tidTil);
        medarbejder.addVagt(vagt);
        Storage.storeVagter(vagt);
        return vagt;
    }

    public static Funktion opretFunktioner(String navn){
        Funktion funktion = new Funktion(navn);
        Storage.storeFunktioner(funktion);
        return funktion;
    }

    public static void initStorage(){

        Funktion f1 = Controller.opretFunktioner("Filetering");
        Funktion f2 = Controller.opretFunktioner("Grøntsager");
        Funktion f3 = Controller.opretFunktioner("Sovs og tilbehør");
        Funktion f4 = Controller.opretFunktioner("Buffetopfyldning");

        Medarbejder m1 = Controller.opretMedarbejder("Peter", 6, LocalTime.of(8, 0));
        Medarbejder m2 = Controller.opretMedarbejder("Anne", 8, LocalTime.of(8, 0));
        Medarbejder m3 = Controller.opretMedarbejder("Marie", 6, LocalTime.of(10, 0));
        Medarbejder m4 = Controller.opretMedarbejder("Torben", 8, LocalTime.of(7, 0));



        Vagt v1 = Controller.opretVagter("Røgede ål til medarbejderne",
                LocalDateTime.of(LocalDate.of(2022, 6, 24), LocalTime.of(8, 0)),
                LocalDateTime.of(LocalDate.of(2022, 6, 6), LocalTime.of(12, 30)),f1,m1);






    }
}
