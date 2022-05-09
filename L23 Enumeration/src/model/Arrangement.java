package model;

import java.util.ArrayList;

public class Arrangement {
    private String navn;
    private boolean offentlig;
    private final ArrayList<Reservation> reservations = new ArrayList<>();

    public Arrangement(String navn, boolean offentlig) {
        this.navn = navn;
        this.offentlig = offentlig;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public String getNavn() {
        return navn;
    }
    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public void removeReservation(Reservation reservation){
        reservations.add(reservation);
    }
}
