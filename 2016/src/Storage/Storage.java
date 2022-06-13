package Storage;

import Model.Bane;
import Model.Medlem;

import java.util.ArrayList;

public class Storage {
    static final ArrayList<Bane> baner = new ArrayList<>();
    static final ArrayList<Medlem> medlemmer = new ArrayList<>();

    public static ArrayList<Bane> getBaner(){
        return new ArrayList<>(baner);
    }
    public static ArrayList<Medlem> getMedlemmer(){
        return new ArrayList<>(medlemmer);
    }
    public static void gemBane(Bane bane){
        baner.add(bane);
    }
    public static void gemMedlem(Medlem medlem){
        medlemmer.add(medlem);
    }
}
