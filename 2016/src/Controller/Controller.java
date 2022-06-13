package Controller;

import Model.Bane;
import Model.Medlem;
import Model.Reservation;
import Storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;

public class Controller {

    public static void opretBane(int nummer, String baneInfo){
        Bane bane = new Bane(nummer,baneInfo);
        Storage.gemBane(bane);
    }

    public static void opretMedlem(String navn, int mobil, String mail){
        Medlem medlem = new Medlem(navn, mail, mobil);
        Storage.gemMedlem(medlem);
    }
    public static void initStorage(){
        opretMedlem("Lene Mikkelsen", 12345678 , "lm@msn.com");
        opretMedlem("Finn Jensen", 22331144, "fj@msn.com");


        opretBane(1,"Nord/Syd vendt");
        opretBane(2, "Under egettræet");
        opretBane(3, "Med tilskuerpladser");
    }

    public static Reservation createReservation(Medlem booker, Medlem makker, Bane bane, LocalDate dato, LocalTime startTid){
        Reservation reservation = null;
        if ()
    }

}
