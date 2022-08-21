package storage;

import model.Fag;
import model.Lektion;
import model.Studerende;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Fag> fag = new ArrayList<>();

    private static final ArrayList<Studerende> studerende = new ArrayList<>();

    private static final ArrayList<Lektion> lektioner = new ArrayList<>();

    public static ArrayList<Fag> getFag(){
        return new ArrayList<>(fag);
    }
    public static ArrayList<Studerende> getStuderende(){
        return new ArrayList<>(studerende);
    }
    public static ArrayList<Lektion> getLektioner(){
        return new ArrayList<>(lektioner);
    }


    public static void storeFag(Fag f){
        fag.add(f);
    }
    public static void storeStuderende(Studerende s){
        studerende.add(s);
    }

    public static void storeLektion(Lektion l){
        lektioner.add(l);
    }
}
