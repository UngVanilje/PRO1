package Model;

public class FrivilligForening extends Frivillig{
    private String foreningsNavn;
    private int antalPersoner;

    public FrivilligForening(String foreningsNavn, int antalPersoner, String navn, String mobil, int maksAntalTimer) {
        super(navn, mobil, maksAntalTimer);
        this.foreningsNavn = foreningsNavn;
        this.antalPersoner = antalPersoner;
    }

    public String getForeningsNavn() {
        return foreningsNavn;
    }

    public int getAntalPersoner() {
        return antalPersoner;
    }
}
