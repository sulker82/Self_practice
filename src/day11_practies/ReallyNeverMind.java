package day11_practies;

import java.util.Scanner;

public class ReallyNeverMind {

    public static void main(String[] args) {

        /*
        Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends
         with "ly", print "really???" ,  otherwise, print "never mind"
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        String lastTwoChars = word.substring( word.length()-2 );

        if(lastTwoChars.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("Never mind");
        }

        scan.close();

    }
}
