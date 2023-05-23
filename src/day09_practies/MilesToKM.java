package day09_practies;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles:");
        double mile =input.nextDouble();
        double km =mile*1.609;
        System.out.println(mile+" miles equal to "+km+" kilometers ");
    }


    /*
        Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
     */
}
