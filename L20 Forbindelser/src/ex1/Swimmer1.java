package ex1;

import java.util.ArrayList;

public class Swimmer1 {
    private String name;
    private ArrayList<Double> lapTimes;
    private TrainingPlan1 trainingPlan1;
    private int allTraningHours;

    public Swimmer1(String name, ArrayList<Double> lapTimes) {
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
        double bestTime = getLapTimes().get(0);
        for (int i = 0; i < getLapTimes().size(); i++ ){
            if (bestTime > getLapTimes().get(i)){
                bestTime = getLapTimes().get(i);
            }
        }
        return bestTime;
    }

    public TrainingPlan1 getTrainingPlan() {
        return trainingPlan1;
    }

    public void setTrainingPlan(TrainingPlan1 trainingPlan1) {
        this.trainingPlan1 = trainingPlan1;
    }
    public void removeGroup(){
        this.trainingPlan1 = null;
    }

    public int allTraningHours(){
        int totalTimer = 0;
        int Jan = getTrainingPlan().getWeeklyWaterHours() + getTrainingPlan().getWeeklyStrengthHours();
        int Bo = getTrainingPlan().getWeeklyWaterHours() + getTrainingPlan().getWeeklyStrengthHours() ;
        int Mikkel = getTrainingPlan().getWeeklyWaterHours() + getTrainingPlan().getWeeklyStrengthHours();
        this.allTraningHours = getTrainingPlan().getWeeklyWaterHours() + getTrainingPlan().getWeeklyStrengthHours();
        totalTimer = Jan + Bo + Mikkel;
        return allTraningHours;
    }

}
