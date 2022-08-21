package storage;

import model.Funktion;
import model.Medarbejder;
import model.Vagt;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Medarbejder> medarbejderS = new ArrayList<>();

    private static final ArrayList<Vagt> vagterS = new ArrayList<>();

    private static final ArrayList<Funktion> funktionerS = new ArrayList<>();

    public static ArrayList<Medarbejder> getMedarbejderS(){
        return new ArrayList<>(medarbejderS);
    }
    public static ArrayList<Vagt> getVagterS(){
        return new ArrayList<>(vagterS);
    }
    public static ArrayList<Funktion> getFunktionerS(){
        return new ArrayList<>(funktionerS);
    }


    public static void storeMedarbejder(Medarbejder m){
        medarbejderS.add(m);
    }
    public static void storeVagter(Vagt v){
        vagterS.add(v);
    }

    public static void storeFunktioner(Funktion f){
        funktionerS.add(f);
    }
}
