package model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Vagt {
    private String navn;
    private LocalDateTime tidFra;
    private LocalDateTime tidTil;

    private  final ArrayList<Medarbejder> medarbejdere = new ArrayList<>();
    private final ArrayList<Antal> antal = new ArrayList<>();

    public Vagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil) {
        this.navn = navn;
        this.tidFra = tidFra;
        this.tidTil = tidTil;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDateTime getTidFra() {
        return tidFra;
    }

    public LocalDateTime getTidTil() {
        return tidTil;
    }

    public ArrayList<Medarbejder> getMedarbejdere() {
        return medarbejdere;
    }

    public ArrayList<Antal> getAntal() {
        return antal;
    }

    public Antal opretAntal(int timer){
        Antal a1 = new Antal(timer);
        antal.add(a1);
        return a1;

    }

    public Medarbejder findMedarbejder(LocalTime tidspunkt, int antalTimer){
        Medarbejder found = null;
        for(Medarbejder medarbejder : medarbejdere){
            if(medarbejder.getTypiskMødetid() == tidspunkt && medarbejder.getAntalTimerPrDag() >= antalTimer)
                found = medarbejder;
            else
                return found;
        }
        return found;
    }

    public int beregnTimeForbrug(){
        int samletTimerArbejdet = 0;
        for (Medarbejder medarbejder : medarbejdere){
            samletTimerArbejdet += medarbejder.getAntalTimerPrDag();
        }
        if (samletTimerArbejdet % 2 == 0)
            return samletTimerArbejdet;
        else
            samletTimerArbejdet = samletTimerArbejdet + (samletTimerArbejdet % 2);
        return samletTimerArbejdet;
    }

//    public Vagt antalMedarbejdereMedFunktion(Funktion funktion){
//        int antalMedFunktion = 0;
//        for (Medarbejder medarbejder : medarbejdere){
//            if
//                antalMedFunktion ++;
//
//        }
//        return antalMedFunktion;
//    }
//
//    public Medarbejder[] skalAdviseresOmMødetid(){
//        Medarbejder medarbejder = null;
//        int i = 0;
//        while (medarbejder == null && i < medarbejdere.size()){
//            if()
//        }
//    }


    @Override
    public String toString() {
        return navn;
    }
}
