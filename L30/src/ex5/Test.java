package ex5;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("White");
        strings.add("Black");
        strings.add("Red");
        strings.add("Green");
        strings.add("Yellow");

        System.out.println("Size of list: " + strings.size());
        System.out.println(findAllIndices(strings, "e"));

    }

    public static ArrayList<Integer> findAllIndices(ArrayList<String> list, String target) {
        ArrayList<Integer> integers = new ArrayList<>();

         for (String string : list) {
            String subString = string;

            int previousIndex = 0;

            while (subString.contains(target)) {
                previousIndex = subString.indexOf(target) + previousIndex + 1;
                integers.add(previousIndex - 1);
                subString = string.substring(previousIndex);
            }
        }
        return integers;
    }
}

