package Model;

import java.util.ArrayList;

public class Vagt {
    private int timer;
    private Frivillig frivillig;
    private Job job;

    Vagt(int timer) {
        this.timer = timer;
    }

    public int getTimer() {
        return timer;
    }
}
