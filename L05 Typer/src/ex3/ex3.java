package ex3;

import java.util.Locale;

public class ex3 {
    public static void main(String[] args) {
        String ord1 = "Datamatiker"; //a-f
        String ord2 = "Uddannelsen";
        String ord3 = ord1 + ord2;

        String s = ord1.toUpperCase();
        String s2 = ord2.toLowerCase();
        String s3 = s + s2;

        System.out.println(s + "  " + s2);
        System.out.println(s3);

        // e)
        String str = s3;
        System.out.println(s3.length());
        //f)
        //   String str1 = s;
        //   System.out.println(s.substring(0,7));
        //g)
        //   String str2 = s2;
        //   System.out.println(s2.substring(3,7));
        //h)
        System.out.println(s3.substring(ord3.length() / 2));

    }
}
