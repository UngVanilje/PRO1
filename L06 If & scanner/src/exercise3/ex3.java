package exercise3;

public class ex3 {
    public static void main(String[] args) {
        ex3info p1 = new ex3info(69);
        System.out.println("Remaning papers: " + p1.getPaperCount());
        p1.makeCopy();
        p1.insertPaper(69);
        p1.makePaperJam();
        p1.makeCopy();
        p1.fixJam();
    }
}
