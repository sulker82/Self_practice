package day24_practies;

import java.util.ArrayList;
import java.util.Arrays;

public class Country_names {

    /*
    Create an ArrayList of string called country names, write a program that
     can remove all the country names that have length of 10 or greater
     */

    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        countries.addAll(Arrays.asList(
                "Australia", "Canada", "Bosnia and Herzegovina", "Spain",
                "Argentina", "Malta", "United States of America", "Italy"
        ));


        countries.removeIf(p -> p.length() >= 10);
        System.out.println(countries);
        countries.removeIf(p -> p.length()>6);
        System.out.println(countries);
    }
}
