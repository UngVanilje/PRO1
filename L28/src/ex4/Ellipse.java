package ex4;

public class Ellipse extends Figur {

    private double radius1;
    private double radius2;

    public Ellipse(int x, int y, double radius1, double radius2) {
        super(x, y);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public String toString() {
        return "Figurtype: Ellipse" + "\nPosition: " + "x: " + getX() + "," + "y: " + getY() + "\nAreal: " + area();
    }

    @Override
    public double area() {
        return Math.PI * radius1 * radius2;
    }
}
