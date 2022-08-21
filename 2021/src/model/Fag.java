package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fag {
    private String navn;
    private String klasse;
    public final ArrayList<Lektion> lektioner = new ArrayList<>();

    public Fag(String navn, String klasse) {
        this.navn = navn;
        this.klasse = klasse;
    }

    public String getNavn() {
        return navn;
    }

    public String getKlasse() {
        return klasse;
    }

    public ArrayList<Lektion> getLektioner() {
        return lektioner;
    }


    public void addLektioner(Lektion lektion){
        lektioner.add(lektion);
    }

    public ArrayList<Studerende> sygdomPåDato(LocalDate dato){
        ArrayList<Studerende> studerende1 = new ArrayList<>();
        for(Lektion lektion : lektioner){
            if(LocalDate.now().isEqual(dato))
                for(Deltagelse deltagelse : lektion.deltagelser){
                    if(deltagelse.isRegistreret() && deltagelse.getStatus() == deltagerStatus.SYG && !studerende1.contains(deltagelse.getStuderende()))
                        studerende1.add(deltagelse.studerende);
            }
        }
        return studerende1;
    }
    public Lektion lektionMedMestFravær(){
        int maxFravær = 0;
        Lektion lektionMestFravær = null;
        for(Lektion lektion : lektioner){
            int lektionFravær = 0;
            for(Deltagelse deltagelse : lektion.deltagelser){
                if(deltagelse.erRegistreretFraværende())
                    lektionFravær++;
            }
            if(maxFravær < lektionFravær)
                maxFravær = lektionFravær;
            lektionMestFravær = lektion;
        }
        return lektionMestFravær;
    }

    @Override
    public String toString() {
        return  navn + " " +  klasse;
    }
}
