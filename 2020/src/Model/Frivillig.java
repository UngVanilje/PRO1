package Model;

import Storage.Storage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Frivillig {
    private String navn;
    private String mobil;
    private int maksAntalTimer;

    final ArrayList<Vagt> vagter = new ArrayList<>();

    public Frivillig(String navn, String mobil, int maksAntalTimer) {
        this.navn = navn;
        this.mobil = mobil;
        this.maksAntalTimer = maksAntalTimer;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public int getMaksAntalTimer() {
        return maksAntalTimer;
    }

    public int ledigeTimer(){
        int resterendeTimer = maksAntalTimer;
        for(Vagt vagt : vagter){
                resterendeTimer -= vagt.getTimer();
        }
        return resterendeTimer;
    }


}
