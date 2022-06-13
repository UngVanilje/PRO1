package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Festival {
    private String navn;
    private LocalDate fraDato;
    private LocalDate tilDato;
    ArrayList<Job> jobs = new ArrayList<>();

    public Festival(String navn, LocalDate fraDato, LocalDate tilDato) {
        this.navn = navn;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public int budgetteretJobUdgift(){
        int samletLøn = 0;
        for (Job job : jobs) {
             samletLøn = samletLøn + job.getAntalTimer() * job.getTimeHonorar();
        }
        return samletLøn;
    }
    public int realiseretJobUdgift(){
        int Udgift = 0;
        for (Job job : jobs) {
            if(job.getAntalTimer() != 0){
                Udgift = Udgift + job.getTimeHonorar() * job.getAntalTimer();
            }
        }
        return Udgift;
    }
}
