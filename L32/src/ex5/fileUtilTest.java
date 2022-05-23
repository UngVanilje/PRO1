package ex5;

import java.io.IOException;

public class fileUtilTest {
    public static void main(String[] args) {
        //Bob fil
        fileUtil fileUtil = new fileUtil();
        fileUtil.max("Bob");
        fileUtil.min("Bob");
        try {
            fileUtil.average("Bob");
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
        System.out.println();
        //Boband fil
        fileUtil fileUtil1 = new fileUtil();
        fileUtil1.max("Boband");
        fileUtil1.min("Boband");
        try {
            fileUtil1.average("Boband");
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
        System.out.println();
        //bobandvagene
        fileUtil fileUtil2 = new fileUtil();
        fileUtil2.max("Bobandvagene");
        fileUtil2.min("Bobandvagene");
        try {
            fileUtil2.average("Bobandvagene");
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }
}
