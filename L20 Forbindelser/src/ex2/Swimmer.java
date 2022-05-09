package ex2;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    /** Return the fastest lap time. */
    public double bestLapTime() {
        // TODO: implement!
        double bestTime = getLapTimes().get(1);
        for (int i = 0; i < getLapTimes().size(); i++ ){
            if (bestTime > getLapTimes().get(i)){
                bestTime = getLapTimes().get(i);
            }
        }
        return bestTime;
    }
}
