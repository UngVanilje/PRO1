package ex5;

import java.util.Arrays;

public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student("Hanne");
        Student s2 = new Student("Margrethe");

        System.out.println(s1.getName());
        s1.addGrade(04);
        s1.addGrade(02);
        s1.addGrade(-3);
        s1.addGrade(00);
        s1.addGrade(04);
        s1.addGrade(07);
        s1.addGrade(04);

        System.out.println("Current grade: " + Arrays.toString(s1.getGrades()));
        System.out.println("Average grade: " + s1.gradeAverage());
        System.out.println("Highest grade: " + s1.maxGrade());
        System.out.println("Lowest grade: " + s1.minGrade());
        System.out.println("Current given grades: " + Arrays.toString(s1.getActualGrades()));

        System.out.println("\n" + s2.getName());
        s2.addGrade(04);
        s2.addGrade(07);
        s2.addGrade(12);
        s2.addGrade(10);
        s2.addGrade(07);
        s2.addGrade(07);

        System.out.println("Current grades: " + Arrays.toString(s2.getGrades()));
        System.out.println(("Average grade: " + s2.gradeAverage()));
        System.out.println("Highest grade: " + s2.maxGrade());
        System.out.println("Lowest grade: " + s2.minGrade());
        System.out.println("Current given grades: " + Arrays.toString(s2.getActualGrades()));


    }
}
