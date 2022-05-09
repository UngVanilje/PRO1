package ex1;

public class person {
    private String name;
    private String title;
    private boolean senior;


    public person(String name, String title, boolean senior) {
        this.name = name;
        this.title = title;
        this.senior = senior;
    }

    public String toString() {
        String s = title + " " + name;
        if (senior) {
            s = s + " (Senior)";
        }
        return s;
    }
}
