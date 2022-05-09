package ex6;

public class Child {
    private final String name;
    private final double[] weights;// can contain weights for the first 11 years
    private int weightsCount;

    public Child(String name) {
        this.name = name;
        this.weights = new double[11];
        this.weightsCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public double[] getWeights() {
        return this.weights;
    }

    public int getWeightsCount() {
        return this.weightsCount;
    }

    public int getageWeight(int age) {
        return age;
    }

    public void addNewWeight(double newWeight) {
        weights[weightsCount] = newWeight;
        weightsCount++;
    }
    public double maxYearlyWeightGain() {
        double max = 0;
        for ( int i = 0; i < weightsCount - 1; i++){
            if (weights[i + 1] - weights[i] > max){
                max = weights[i + 1] - weights[i];
            }
        }
        return max;
    }

}
