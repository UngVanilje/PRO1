package ex4;

public class Cirkel extends Figur {

    private double r;

    public Cirkel(int x, int y, double r) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Figurtype: Cirkel" + "\nPosition: " + "x: " + getX() + "," + "y: " + getY() + "\nAreal: " + area();
    }

    @Override
    public double area() {
        return Math.PI * (r * r);
    }
}
