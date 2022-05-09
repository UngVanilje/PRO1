package ex23;

public class Person {
    private final String name;
    private final int dayOfBirth; // 1..31
    private final int monthOfBirth; // 1..12
    private final int yearOfBirth; // 1900..2010

    public Person(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public void printPerson() {
        System.out.println(name + ", born " + yearOfBirth + "-" + monthOfBirth + "-" + dayOfBirth);
    }
    public int calcAge(int year, int month, int day) {
        int aYear = year - yearOfBirth;
        if (month < monthOfBirth) {
            aYear = aYear - 1;
        }
        else if (month == monthOfBirth && day < dayOfBirth){
            aYear = aYear - 1;
        }
            return aYear;

    }
    public boolean leapYear(int year){
        boolean leapyear = false;
        if (year % 4 == 0){
            leapyear = true;
        }
        else if (year % 100 == 0){
            leapyear = false;

        }
        else if (year % 400 == 0){
            leapyear = true;
        }
        return leapyear;
    }

}
