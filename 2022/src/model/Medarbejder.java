package model;

import com.sun.source.tree.CatchTree;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Medarbejder {
    private String navn;
    private int antalTimerPrDag;
    private LocalTime typiskMødetid;

    private final ArrayList<Funktion> funktioner = new ArrayList<>();
    private final ArrayList<Vagt> vagter = new ArrayList<>();

    public Medarbejder(String navn, int antalTimerPrDag, LocalTime typiskMødetid) {
        this.navn = navn;
        this.antalTimerPrDag = antalTimerPrDag;
        this.typiskMødetid = typiskMødetid;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntalTimerPrDag() {
        return antalTimerPrDag;
    }

    public LocalTime getTypiskMødetid() {
        return typiskMødetid;
    }

    public ArrayList<Funktion> getFunktioner() {
        return funktioner;
    }

    public ArrayList<Vagt> getVagter() {
        return vagter;
    }

    public void addVagt(Vagt vagt){
        vagter.add(vagt);
    }

//    public Vagt opretVagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil, Medarbejder medarbejder){
//        Vagt v1 = new Vagt(navn, tidFra, tidTil);
//        vagter.add(v1);
//        return v1;
//    }
    public void tildelVagt() throws RuntimeException {
        try {

        }
        catch (RuntimeException e){
            e.getStackTrace();

        }
    }




    @Override
    public String toString() {
        return navn + "Typisk mødetid" + typiskMødetid;
    }
}
