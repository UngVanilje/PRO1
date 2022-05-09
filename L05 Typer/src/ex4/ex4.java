package ex4;

public class ex4 {
    public static void main(String[] args) {
        ex4info p1 = new ex4info("Lars","Larsen","Larsen");
        System.out.println("Firstname: " + p1.getFirstName());
        System.out.println("Middlename: " + p1.getMiddleName());
        System.out.println("Lastname: " + p1.getLastName());
        System.out.println("Fullname: " + p1.getFullName());
        System.out.println("Username: " + p1.getUsername());
        System.out.println("Initialer: " + p1.getInits());
        System.out.println("Cypteret intitialer: " + p1.getCryptoInits(7));

    }
}
