package ex4;

public class Rektangel extends Figur {
    private double s1;
    private double s2;

    public Rektangel(int x, int y, double s1, double s2) {
        super(x, y);
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "Figurtype: Rektangel" + "\nPosition: " + "x: " + getX() + "," + "y: " + getY() + "\nAreal: " + area();
    }

    @Override
    public double area() {
        return s1 * s2;
    }
}