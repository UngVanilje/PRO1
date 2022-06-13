package opg1;

import java.util.ArrayList;

public class Spiller {
    private String navn;
    private int årgang;
    private ProfSpiller profSpiller;
    ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Spiller(String navn, int årgang) {
        this.navn = navn;
        this.årgang = årgang;
    }

    public double kampHonorar(){
        int kamp = 0;
        for (Deltagelse deltagelse : deltagelser) {
            if (deltagelse.getAfbud())
                kamp ++;
        }
        return kamp * 10;
    }

    public String getNavn() {
        return navn;
    }

    public int getÅrgang() {
        return årgang;
    }
}
