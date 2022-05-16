package ex4;

public class Figur {
    private int y;
    private int x;
    private String name;

    public Figur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public String getName() {
        return name;
    }

    public double area() {
        return 0;
    }

    public String toString() {
        return super.toString();
    }

    public void forskyd(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }
}
