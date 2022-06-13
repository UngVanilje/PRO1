package Model;

import Storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;

public class Medlem {
    private String navn;
    private String mail;
    private int mobil;
    private final ArrayList<Reservation> reservationer = new ArrayList<>();


     public Medlem(String navn, String mail, int mobil) {
        this.navn = navn;
        this.mail = mail;
        this.mobil = mobil;
    }

    public String getNavn() {
        return navn;
    }

    public String getMail() {
        return mail;
    }

    public int getMobil() {
        return mobil;
    }

    public ArrayList<Reservation> getBooker() {
        return reservationer;
    }


    public Reservation opretReservation(String navn, int mobil, String mail, LocalDate dato, LocalTime startTid, Medlem makker){
        Reservation reservation = new Reservation(dato, startTid);
        reservationer.add(reservation);
        reservation.booker = this;
        reservation.makker = makker;
        return reservation;

    }


    public void addBooker(Reservation reservation){
        reservationer.add(reservation);
    }

    public boolean hasAktivReservation(){
         boolean fundet = false;
         int i = 0;
         while (!fundet &&  i < reservationer.size()){
             for(Reservation reservation : reservationer){
                 if(reservation.getDato().isAfter(ChronoLocalDate.from(LocalTime.now()))){
                     fundet = true;
                 }
             }
         }
         return fundet;
    }
}
