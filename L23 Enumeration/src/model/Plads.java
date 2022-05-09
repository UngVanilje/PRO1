package model;

import java.util.ArrayList;

public class Plads {
    private int  nummer;
    private Omraade omraade;
    private final ArrayList<Reservation> reservations2 = new ArrayList<>();

    ArrayList<Plads> plads = new ArrayList<>();

    public Plads(int nummer, Omraade omraade){
        this.nummer = nummer;
        this.omraade = omraade;;
    }

    public int getNummer() {
        return nummer;
    }

    public Omraade getOmraade() {
        return omraade;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setOmraade(Omraade omraade) {
        this.omraade = omraade;
    }
}
