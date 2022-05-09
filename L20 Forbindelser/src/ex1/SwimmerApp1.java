package ex1;

import java.util.ArrayList;
import java.util.List;

public class SwimmerApp1 {

    public static void main(String[] args) {
        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.addAll(List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99));

        Swimmer1 jan = new Swimmer1("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.addAll(List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02));

        Swimmer1 bo = new Swimmer1("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.addAll(List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03));

        Swimmer1 mikkel = new Swimmer1("Mikkel", lapTimesMikkel);

        ArrayList<Swimmer1> swimmer1s = new ArrayList<>();
        swimmer1s.add(jan);
        swimmer1s.add(bo);
        swimmer1s.add(mikkel);

        TrainingPlan1 planA = new TrainingPlan1('A', 16, 10);
        TrainingPlan1 planB = new TrainingPlan1('B',10, 6);

        jan.setTrainingPlan(planA);
        bo.setTrainingPlan(planA);
        mikkel.setTrainingPlan(planB);
        int timer = 0;

        for (Swimmer1 s : swimmer1s) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
            System.out.println("Træningsplan: " + s.getTrainingPlan().getLevel());
            System.out.println("Træningstimer pr. uge: " + s.allTraningHours());
            timer += s.allTraningHours();
            };
        System.out.println("\nTotal antal timer: " + timer);
    }
}
