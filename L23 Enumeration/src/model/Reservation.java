package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservation {
    private LocalDateTime start;
    private LocalDateTime slut;
    private final ArrayList<Plads> plads = new ArrayList<>();

    ArrayList<Reservation> reservations = new ArrayList<>();

    Reservation(LocalDateTime start, LocalDateTime slut){
        this.start = start;
        this.slut = slut;
    }

    public void addPlads(Plads plads2){
        plads.add(plads2);
    }
    public void removePlads(Plads plads2){
        plads.remove(plads2);
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setSlut(LocalDateTime slut) {
        this.slut = slut;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getSlut() {
        return slut;
    }

    public ArrayList<Plads> getPlads() {
        return plads;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }



}
