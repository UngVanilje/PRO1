package Controller;

import Model.*;
import Storage.Storage;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class Controller {

    public static Festival createFestival(String name, LocalDate fraDato, LocalDate tilDato) {
        Festival festival = new Festival(name, fraDato, tilDato);
        Storage.festivals.add(festival);
        return festival;
    }

    public static Frivillig createFrivillig(String navn, String mobil, int maksAntalTimer) {
        Frivillig frivillig = new Frivillig(navn, mobil, maksAntalTimer);
        Storage.frivillige.add(frivillig);
        return frivillig;
    }

    public static FrivilligForening createFrivilligForening(String foreningsNavn, int antalPersoner, String navn, String mobil, int maksAntalTimer) {
        FrivilligForening frivilligForening = new FrivilligForening(foreningsNavn, antalPersoner, navn, mobil, maksAntalTimer);
        Storage.frivillige.add(frivilligForening);
        return frivilligForening;
    }

    public static void initStorage() {
        Festival northside = Controller.createFestival("Northside", LocalDate.of(2020, 06, 04), LocalDate.of(2020, 06, 06));

        Controller.createFrivillig("Jane Jensen", "12345677", 20);
        Controller.createFrivillig("Lone Hansen", "78787878", 25);
        Controller.createFrivillig("Anders Mikkelsen", "55555555", 10);

        Controller.createFrivilligForening("Erhvervsakademi Aarhus", 40, "Christian Madsen", "23232323", 100);
    }


}
