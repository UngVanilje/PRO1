package model;

public class Deltagelse {
    private boolean registreret;
    private deltagerStatus status;
    Studerende studerende;
    Lektion lektion;

    public Deltagelse() {
        this.registreret = false;
        this.status = deltagerStatus.TILSTEDE;
    }

    public boolean isRegistreret() {
        return registreret;
    }

    public deltagerStatus getStatus() {
        return status;
    }

    public Studerende getStuderende() {
        return studerende;
    }

    public Lektion getLektion() {
        return lektion;
    }

    public void setRegistreret(boolean registreret) {
        this.registreret = registreret;
    }

    public void setStatus(deltagerStatus status) {
        this.status = status;
    }

    public void addStuderende(Studerende studerende){
        this.studerende = studerende;
        studerende.getDeltagelse().add(this);
    }

    public boolean erRegistreretFraværende(){
            if(!isRegistreret() && status == deltagerStatus.FRAVÆR)
                return registreret;
            else
                registreret = true;

        return registreret;
    }

    @Override
    public String toString() {
        return studerende.getNavn() + " " + registreret + " " + status;
    }
}
