package Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class Bane {
    private int nummer;
    private String baneInfo;
    private final ArrayList<Reservation> reservationer = new ArrayList<>();

    public Bane(int nummer, String baneInfo) {
        this.nummer = nummer;
        this.baneInfo = baneInfo;
    }

    public int getNummer() {
        return nummer;
    }

    public String getBaneInfo() {
        return baneInfo;
    }

    public ArrayList<Reservation> getReservationer() {
        return reservationer;
    }

    public Reservation opretBane(int nummer, String baneInfo, LocalDate dato, LocalTime startTid) {
        Reservation reservation = new Reservation(dato, startTid);
        reservationer.add(reservation);
        reservation.bane = this;
        return reservation;
    }

//    public void addReservation(Reservation reservation) {
//        reservationer.add(reservation);
//    }
    public void addReservation(Reservation reservation){
        for (int i = 0; i < reservationer.size() - 1; i++) {
            int nyPlads = i;
            for (int j = i + 1; j < reservationer.size(); j++) {
                if (reservation.compareTo(reservationer.get(nyPlads)) < 0) {
                    nyPlads = j;
                }
            }
            if (nyPlads != i) {
                Reservation temp = reservationer.get(i);
                reservationer.set(i, reservationer.get(nyPlads));
                reservationer.set(nyPlads, temp);
            }
        }
    }

    public boolean isLedig(LocalDate dato, LocalTime tid) {
        boolean fundet = false;
        int i = 0;
        while (!fundet && i < reservationer.size()) {
            Reservation r = reservationer.get(i);
            if (r.getDato().isEqual(dato) && r.getStartTid().equals(tid))
                fundet = true;
            else
                i++;
        }
        return fundet;

    }

    public ArrayList<LocalTime> getLedigeTiderPaaDag(LocalDate dato) {
        ArrayList<LocalTime> tid = new ArrayList<>();
        LocalTime tidNu = LocalTime.of(6, 0);
        while (tidNu.compareTo(LocalTime.of(22, 0)) <= 0) {
            for (Reservation reservation : reservationer) {
                if (isLedig(dato, tidNu)) {
                    reservationer.add(reservation);
                }
                tidNu = tidNu.plusHours(1);

            }
        }
        return tid;
    }
}
