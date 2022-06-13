package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private LocalDate dato;
    private LocalTime startTid;
    Bane bane;
    Medlem booker;
    Medlem makker;


    Reservation(LocalDate dato, LocalTime startTid) {
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

}
