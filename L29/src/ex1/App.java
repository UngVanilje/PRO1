package ex1;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Chilli[] chilliArray = new Chilli[5];
        Beer[] beerArray = new Beer[5];

        Chilli c1 = new Chilli("Red Savina",500000);
        Chilli c2 = new Chilli("Pot Barrackpore", 1000000);
        Chilli c3 = new Chilli("Naga Viper",1349000);
        Chilli c4 = new Chilli("Primo", 1469000);
        Chilli c5 = new Chilli("Carolina Reaper", 2200000);

        Beer b1 = new Beer("Royal Classic",5.6);
        Beer b2 = new Beer("Royal Export",6.4);
        Beer b3 = new Beer("Royal Pilsner", 5.4);
        Beer b4 = new Beer("Elephant",10.6);
        Beer b5 = new Beer("Giraf",9.7);

        chilliArray[0] = c1;
        chilliArray[1] = c2;
        chilliArray[2] = c3;
        chilliArray[3] = c4;
        chilliArray[4] = c5;

        beerArray[0] = b1;
        beerArray[1] = b2;
        beerArray[2] = b3;
        beerArray[3] = b4;
        beerArray[4] = b5;



        System.out.println("\nAverage chilli strength: " + average(chilliArray) + "Scoville");
        System.out.println("\nStrongest chilli: " + Max(chilliArray).toString());

        System.out.println("\nAverage alchoholpercentage in beers: " + average(beerArray) + "%");
        System.out.println("\nStrongest beer: " + Max(beerArray).toString());

        System.out.println(Arrays.toString(blackFriday(chilliArray, beerArray)));

    }
    public static double average(Measureable[] objects) {
        int total = 0;
        for (int i = 0; i < objects.length; i++){
            total += objects[i].getMeasureable();
        }
        return (double) total / objects.length;
    }

    public static Measureable Max(Measureable[] objects){
        int max = 0;
        for (int i = 0; i< objects.length; i++){
            if(objects[i].getMeasureable() > objects[max].getMeasureable() ){
                max = i;
            }
        }
        return objects[max];
    }

    public static Measureable[] blackFriday(Measureable[] chillies, Measureable[] Beers){
        Measureable[] fridayFood = new Measureable[2];

        fridayFood[0] = Max(chillies);
        fridayFood[1] = Max(Beers);
        return fridayFood;
    }
}
