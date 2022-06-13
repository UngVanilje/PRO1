package opg1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Kamp {
    private String sted;
    private LocalDate dato;
    private LocalTime tid;

    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Kamp(String sted, LocalDate dato, LocalTime tid) {
        this.sted = sted;
        this.dato = dato;
        this.tid = tid;
    }

    public String getSted() {
        return sted;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getTid() {
        return tid;
    }
    public ArrayList<String> afbud(){
        ArrayList<String> strings = new ArrayList<>();
        String str = "";
        for (Deltagelse deltagelse : deltagelser) {
            if(deltagelse.getAfbud())
                str = deltagelse.getSpiller().getNavn() + deltagelse.getÅrsag();
            strings.add(str);
        }
        return strings;
    }
}
