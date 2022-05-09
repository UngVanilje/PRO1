package exercise2;

public class ex2app {
    public static void main(String[] args) {
        ex2 c1 = new ex2(16, true);
        System.out.println("Age: " + c1.getAge());
        System.out.println("Male: " + c1.isMale());
        System.out.println("Team: " + c1.team());
    }
}
