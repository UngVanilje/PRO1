package ex4;

public class Kvadrat extends Figur {
    private double s;

    public Kvadrat(int x, int y, double s) {
        super(x, y);
        this.s = s;
    }


    @Override
    public String toString() {
        return "Figurtype: Kvadrat" + "\nPosition: " + "x: " + getX() + "," + "y: " + getY() + "\nAreal: " + area();
    }

    @Override
    public double area() {
        return Math.pow(s, 2);
    }
}
