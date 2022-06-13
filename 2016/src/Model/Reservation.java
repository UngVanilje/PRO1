package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation implements Comparable<Reservation>{
    private LocalDate dato;
    private LocalTime startTid;
    Bane bane;
    Medlem booker;
    Medlem makker;


    public Reservation(LocalDate dato, LocalTime startTid) {
        this.dato = dato;
        this.startTid = startTid;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public Bane getBane() {
        return bane;
    }

    @Override
    public int compareTo(Reservation secondReservation) {
       // dato
        if(this.getDato().compareTo(secondReservation.getDato()) < 0)
            return -1;
        else if (this.getDato().compareTo(secondReservation.getDato()) > 0)
            return 1;
        //time
        else if(this.getStartTid().compareTo(secondReservation.getStartTid()) < 0)
            return -1;
        else if (this.getStartTid().compareTo(secondReservation.getStartTid()) > 0)
            return 1;
        //banenummer
        else if(this.bane.getNummer() < secondReservation.bane.getNummer())
            return -1;
        else if (this.bane.getNummer() > secondReservation.bane.getNummer())
            return 1;
        else
            return 0;
        }
}






