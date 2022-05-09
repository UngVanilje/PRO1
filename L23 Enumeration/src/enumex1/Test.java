package enumex1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Hund h1 = new Hund("Jørgen", false, 69,Race.Terrier);
        Hund h2 = new Hund("Morten", true, 420,Race.Puddel);
        Hund h3 = new Hund("Thomas", true, 365,Race.Bokser);
        Hund h4 = new Hund("Gewion", false, 254,Race.Bokser);
        Hund h5 = new Hund("Bob", false, 133,Race.Terrier);
        ArrayList<Hund> hunde = new ArrayList<>();
        hunde.add(h1);
        hunde.add(h2);
        hunde.add(h3);
        hunde.add(h4);
        hunde.add(h5);
        System.out.println("Prisen for alle hunde af bokser racen: " + samletPris(hunde, Race.Bokser));
        System.out.println("Prisen for alle hunde af Terrier racen: " + samletPris(hunde, Race.Terrier));
        System.out.println("Prisen for alle hunde af Puddel racen: " + samletPris(hunde, Race.Puddel));
    }
    public static int samletPris(ArrayList<Hund> hunde, Race race) {
        int prisIAlt = 0;
        for (Hund hund : hunde) {
            if (race == hund.getRace()) {
                prisIAlt += hund.getPris();
            }
        }
        return prisIAlt;
    }
}
