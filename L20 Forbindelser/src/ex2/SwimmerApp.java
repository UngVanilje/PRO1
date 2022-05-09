package ex2;

import ex1.TrainingPlan1;

import java.util.ArrayList;
import java.util.List;

public class SwimmerApp {

    public static void main(String[] args) {
        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.addAll(List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99));

        Swimmer jan = new Swimmer("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.addAll(List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02));

        Swimmer bo = new Swimmer("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.addAll(List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03));

        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(jan);
        swimmers.add(bo);
        swimmers.add(mikkel);

        TrainingPlan planA = new TrainingPlan('A', 16, 10);
        TrainingPlan planB = new TrainingPlan('B',10, 6);

        planA.addSwimmer(jan);
        planA.addSwimmer(bo);
        planB.addSwimmer(mikkel);


        for (Swimmer s : planA.getSwimmers()) {
            System.out.println("Navn: " + s.getName() + "\nTræningsplan: " + planA.getLevel() + "\n" + s.bestLapTime());
            System.out.println("Træningstimer: " + planA.allTraningHours());
        }
        for (Swimmer s : planB.getSwimmers()) {
            System.out.println("Navn: " + s.getName() + "\nTræningsplan: " + planB.getLevel() + "\n" + s.bestLapTime());
            System.out.println("Træningstimer: " + planB.allTraningHours());
        }
        System.out.println("Total træningstimer: " + ((planA.allTraningHours() * planA.getSwimmers().size()) + (planB.allTraningHours() * planB.getSwimmers().size())));
    }
}
