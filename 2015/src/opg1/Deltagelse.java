package opg1;

public class Deltagelse {
    private boolean afbud;
    private String årsag;
    private Spiller spiller;

    public Deltagelse(boolean afbud, String årsag, Spiller spiller) {
        this.afbud = afbud;
        this.årsag = årsag;
        this.spiller = spiller;
    }

    public boolean getAfbud() {
        return afbud;
    }

    public String getÅrsag() {
        return årsag;
    }

    public Spiller getSpiller() {
        return spiller;
    }

    public void setAfbud(boolean afbud) {
        this.afbud = afbud;
    }
}
