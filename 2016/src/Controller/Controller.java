package Controller;

import Model.Bane;
import Model.Medlem;
import Model.Reservation;
import Storage.Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void opretBane(int nummer, String baneInfo) {
        Bane bane = new Bane(nummer, baneInfo);
        Storage.gemBane(bane);
    }

    public static void opretMedlem(String navn, int mobil, String mail) {
        Medlem medlem = new Medlem(navn, mail, mobil);
        Storage.gemMedlem(medlem);
    }

    public static void initStorage() {
        opretMedlem("Lene Mikkelsen", 12345678, "lm@msn.com");
        opretMedlem("Finn Jensen", 22331144, "fj@msn.com");


        opretBane(1, "Nord/Syd vendt");
        opretBane(2, "Under egettræet");
        opretBane(3, "Med tilskuerpladser");
    }

    public static Reservation createReservation(Medlem booker, Medlem makker, Bane bane, LocalDate dato, LocalTime startTid) {
        Reservation reservation = null;
        if (bane.isLedig(dato, startTid) && !booker.hasAktivReservation() && !makker.hasAktivReservation()) {
            reservation = booker.opretReservation(booker.getNavn(), booker.getMobil(), booker.getMail(),
                    dato, startTid, makker);
        } else
            return null;

        return reservation;
    }

    public static void writeLedigeTider(LocalDate dato, String filnavn) throws FileNotFoundException {
        File out = new File("2016/src/Controller/Controller");
        ArrayList<LocalTime> tid = null;

         try (PrintWriter writer = new PrintWriter("Output.txt")){
             for (Bane bane : Storage.getBaner()) {
                 writer.println("Ledige tider for bane #" + bane.getNummer());
                 writer.println(bane.getLedigeTiderPaaDag(dato));
                 writer.println();
             }
        }
         catch (FileNotFoundException e){
             e.getStackTrace();

         }
    }
}



