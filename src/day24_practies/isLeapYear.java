package day24_practies;

import java.time.LocalDate;


public class isLeapYear {

    /*
    Create a function that accepts an int argument birthYear, return true if the
    person was born on leap year, otherwise return false

     */


    public static boolean isLeapYear(int birthYear){
        return LocalDate.of(birthYear,1,1).isLeapYear();
    }

}
