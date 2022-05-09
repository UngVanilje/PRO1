package ex6;

import java.util.Arrays;

public class TestChild {

    public static void main(String[] args) {
        Child b1 = new Child("Emma");
        Child b2 = new Child("Oliver");

        System.out.println(b1.getName() + "'s info:");
        System.out.println("Current weight: " + b1.getageWeight(7) + "kg");
        b1.addNewWeight(4.2);
        b1.addNewWeight(7.2);
        b1.addNewWeight(11.2);
        b1.addNewWeight(14);
        b1.addNewWeight(15.2);
        b1.addNewWeight(18.2);
        b1.addNewWeight(21.2);
        b1.addNewWeight(24.2);
        System.out.println("Past years weigh-ins in order: " + Arrays.toString(b1.getWeights()));
        System.out.println(String.format("Highest weight increase in 1 year: %.2f", b1.maxYearlyWeightGain()));
        System.out.println("\n" + b2.getName() + "'s info");
        System.out.println("Current weight: " + b2.getageWeight(5) + "kg");
    }

}
