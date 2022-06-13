package opg1;

import java.util.ArrayList;

public class Storage {
    public final ArrayList<Kamp> kampe = new ArrayList<>();
    public final ArrayList<Spiller> spillere = new ArrayList<>();

    public void addKampe(Kamp kamp){
        kampe.add(kamp);
    }

    public void addSpiller(Spiller spiller){
        spillere.add(spiller);
    }

    public ArrayList<Kamp> getKampe() {
        return kampe;
    }

    public ArrayList<Spiller> getSpillere() {
        return spillere;
    }
}
