package model;

import java.util.ArrayList;

public class Studerende implements Comparable<Studerende>{
private String navn;
private String email;
private ArrayList<Deltagelse> deltagelse = new ArrayList<>();

    public Studerende(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Deltagelse> getDeltagelse() {
        return deltagelse;
    }
    public int antalFraværsLektioner(){
        int antalFravær = 0;
        for(Deltagelse deltag : deltagelse){
            if(deltag.erRegistreretFraværende())
                antalFravær++;
        }
        return antalFravær;
    }

    @Override
    public int compareTo(Studerende secondStuderende) {
        if(this.navn.compareTo(secondStuderende.navn) < 0)
            return -1;
        else if(this.navn.compareTo(secondStuderende.navn) > 0)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Studerendes navn:" + navn + "\nAntal fravær: " + antalFraværsLektioner();
    }
}
