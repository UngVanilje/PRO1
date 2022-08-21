package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Lektion {
    private LocalDate dato;
    private LocalTime startTid;
    private String lokale;
    public final ArrayList<Deltagelse> deltagelser = new ArrayList<>();



    public Lektion(LocalDate dato, LocalTime startTid, String lokale) {
        this.dato = dato;
        this.startTid = startTid;
        this.lokale = lokale;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public String getLokale() {
        return lokale;
    }

    public ArrayList<Deltagelse> getDeltagelse() {
        return deltagelser;
    }
    public Deltagelse createDeltagelse(){
        Deltagelse d1 = new Deltagelse();
        deltagelser.add(d1);
        d1.lektion = this;
        return d1;
    }

    @Override
    public String toString() {
        return dato + " " + startTid + " " + lokale;
    }
}
