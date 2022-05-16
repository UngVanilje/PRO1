package ex5;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Indkøbskurv i = new Indkøbskurv();

        Vare v1 = new Vare("Bamse", 50, "Gul bjørnebamse");
        Vare v2 = new Vare("Tiger", 50, "Gul & sort tigerbamse");
        Spiritus s1 = new Spiritus("Rom", 150, "Caribisk rom", 42);
        Spiritus s2 = new Spiritus("Tequila", 85, "Mexikansk hjemmybryg", 45);
        El_artikler e1 = new El_artikler("Printer", 1200, "HP printer", 120);
        El_artikler e2 = new El_artikler("Samsung oplader", 8, "Fake samsung mobil oplader", 50);
        Fødevare f1 = new Fødevare("Oksekød", 45, "400g hakket oksekød", LocalDate.of(2022, 5, 11));
        Fødevare f2 = new Fødevare("Kylling", 35, "250g Kyllingebryst", LocalDate.of(2022, 5, 13));

        i.addVare(v1);
        i.addVare(v2);
        i.addVare(s1);
        i.addVare(s2);
        i.addVare(e1);
        i.addVare(e2);
        i.addVare(f1);
        i.addVare(f2);

        i.reciept();
    }
}
