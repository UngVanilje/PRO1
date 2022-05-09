package exercise2;

public class ex2 {
    private int age;
    private final boolean gender;

    public ex2(int age, boolean gender) {
        this.gender = gender;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void institution() {

        if (age == 0) {
            System.out.println("Institution: Home");
        } else if (age > 0 && age < 2) {
            System.out.println("Nursery");
        } else if (age > 3 && age < 5) {
            System.out.println("Kindergarten");
        } else if (age > 6 && age < 16) {
            System.out.println("School");
        } else if (age > 17) {
            System.out.println("Out of school");
        }
    }

    public String team() {
        if (gender == true && age < 8) {
            return "Young boys";
        } else if (gender == true && age > 8) {
            return "Cool boys";
        } else if (gender == false && age < 8) {
            return "Tumbling girls";
        } else if (gender == false && age > 8) {
            return "Springy girls";
        }
        return "";

    }


}
