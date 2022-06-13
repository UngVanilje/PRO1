package Storage;

import Model.Festival;
import Model.Frivillig;

import java.util.ArrayList;

public class Storage {
    public static final ArrayList<Festival> festivals = new ArrayList<>();
    public static final ArrayList<Frivillig> frivillige = new ArrayList<>();


    public ArrayList<Festival> getFestivals() {
        return festivals;
    }

    public ArrayList<Frivillig> getFrivillige() {
        return frivillige;
    }
}
