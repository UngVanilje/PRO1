package opg1;

public class ProfSpiller extends Spiller{
    private double kampHonorar;
    Spiller spiller;

    public ProfSpiller(String navn, int årgang, double kampHonorar) {
        super(navn, årgang);
        this.kampHonorar = kampHonorar;
    }

    public double getKampHonorar() {
        double profHonorar = 0;
        int kamp = 0;
        for (Deltagelse deltagelse : deltagelser) {
            if(!deltagelse.getAfbud()){
                kamp ++;
            }
            profHonorar = (double) kamp / deltagelser.size() * 100;
        }

        return kampHonorar() - profHonorar;
    }
}
