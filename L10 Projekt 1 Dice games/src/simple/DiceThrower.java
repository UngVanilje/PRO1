package simple;

public class DiceThrower {
    // 2 dice with face count of 6 each
    private Die die1, die2;

    // TODO: Add fields.
    // Fields:
    // 1. The roll count.
    private int rollCount;
    // 2. The total of all face values rolled.
    private int totalValue;
    // 3. The count of face value 6.
    private int sixCount;
    // 4. The count of same face value on both dice.
    private int sameCount;
    // 5. The maximum sum of the face values in one roll.
    private int max = 0;
    // Remember to update fields, when the dice are rolled.

    /**
     * Creates a DiceThrower object.
     */
    public DiceThrower() {
        die1 = new Die();
        die2 = new Die();
        rollCount = 0;
        totalValue = 0;
        sixCount = 0;
        sameCount = 0;


    }
    // TODO: Make a constructor that initialises all fields.

    // TODO: Add get methods for the fields.


    public int getRollCount() {
        return rollCount;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getSixCount() {
        return sixCount;
    }

    public int getSameCount() {
        return sameCount;
    }

    public int getMax() {
        return max;
    }

    /**
     * Rolls the 2 dice.
     */
    public void roll() {
        // TODO: Roll the 2 dice.
        die1.roll();
        die2.roll();
        rollCount++;
        totalValue = totalValue + die1.getFaceValue() + die2.getFaceValue();
        if (die1.getFaceValue() == 6) {
            sixCount = sixCount + 1;
        }
        if (die2.getFaceValue() == 6) {
            sixCount = sixCount + 1;
        }
        if (die1.getFaceValue() == die2.getFaceValue()) {
            sameCount = sameCount + 1;
        }
        if (max < die1.getFaceValue() + die2.getFaceValue()) {
            max = die1.getFaceValue() + die2.getFaceValue();
        }

    }

    /**
     * Returns the sum of the face values in a roll.
     */
    public int sum() {
        // TODO
        return totalValue;
    }

    /**
     * Returns a textual description of the roll of the 2 dice.
     * Example: Returns "(4,5)" for a roll of 4 and 5.
     */
    public String rollDescription() {
        // TODO: Use the method: String.format().
        return String.format("(%d,%d)", die1.getFaceValue(), die2.getFaceValue());
    }
}
