package simple;

import java.util.Random;

public class Die {
    // number of faces
    private int faceCount;
    // value of upper face
    private int faceValue;
    Random random = new Random();

    /**
     * Creates a die with the given face count and a random face value.
     */
    public Die(int faceCount) {
        this.faceCount = faceCount;
        this.faceValue = random.nextInt(1, faceCount + 1);

        // TODO
        // Remember to initialise all fields.
    }

    /**
     * Creates a die with 6 faces and a random face value.
     */
    public Die() {
        this.faceCount = 6;
        this.faceValue = random.nextInt(1, faceCount);
    }

    // TODO: Make another constructor

    public int getFaceCount() {
        return faceCount;
    }

    public int getFaceValue() {
        return faceValue;
    }
    // TODO: make getters

    /**
     * Rolls the die, resulting in a new face value.
     */
    public void roll() {
        // TODO
        this.faceValue = random.nextInt(1, faceCount + 1);
    }
}