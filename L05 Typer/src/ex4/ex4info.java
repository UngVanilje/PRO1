package ex4;

import org.w3c.dom.css.Counter;

import java.util.Locale;

public class ex4info {
    private String firstName;
    private String middleName;
    private String lastName;

    //Uden mellemnavn
    public ex4info(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
    }

    //Med mellemnavn
    public ex4info(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
//Username


    public String getUsername() {
        String s = firstName.toUpperCase();
        String s2 = lastName.toLowerCase();
        String s3 = firstName + middleName + lastName;
        return s.substring(0, 2) + middleName.length() + s3.substring(s3.length() - 2);
    }

    //Initialer
    public String getInits() {
        return "" + firstName.charAt(0) + lastName.charAt(0);
    }
    //Crypto

    public String getCryptoInits(int count) {
        return "" + (char) (firstName.charAt(0) + count) + (char) (lastName.charAt(0) + count);
    }
}
