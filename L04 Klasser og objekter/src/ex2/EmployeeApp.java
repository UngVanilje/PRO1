package ex2student;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee e1 = new Employee("Mike","Oxlong",24);
        System.out.println("Name: " + e1.getName());
        System.out.println("Trainee? " + e1.isTrainee());

        e1.setAge(24);
        System.out.println("Age: " + e1.getAge());
        e1.Birthday();
        System.out.println(e1.getAge());

        e1.setTrainee(false);
        e1.printEmployee();
        System.out.println();
    }
}
