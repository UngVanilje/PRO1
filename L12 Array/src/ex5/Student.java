package ex5;

public class Student {
    private final String name;
    private final int[] grades;// containing the student's grades
    private int gradeCount;// the current number of grades

    private static final int MAX_GRADE_COUNT = 10;// maximum number of grades

    public Student(String name) {
        this.name = name;
        this.grades = new int[Student.MAX_GRADE_COUNT];
        this.gradeCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public int[] getGrades() {
        return this.grades;
    }

    public int getGradeCount() {
        return this.gradeCount;
    }

    //a
    public void addGrade(int grade) {
        if (getGradeCount() < MAX_GRADE_COUNT) {
            grades[gradeCount] = grade;
            gradeCount++;
        }
    }

    //b
    public double gradeAverage() {
        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return (double) sum / gradeCount;
    }

    //c
    public int maxGrade() {
        int l = 0;
        for (int i = 0; i < gradeCount; i++) {
            if (l < grades[i]) {
                l = grades[i];
            }
        }
        return l;
    }

    //d
    public int minGrade() {
        int k = 12;
        for (int i = 0; i < gradeCount; i++) {
            if (k > grades[i]) {
                k = grades[i];
            }
        }
        return k;
    }

    //e
    public int[] getActualGrades() {
        int[] tempArray = new int[gradeCount];
        for (int i = 0; i < gradeCount; i++) {
            tempArray[i] = grades[i];
        }
        return tempArray;
    }
}
