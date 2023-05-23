package day11_practies;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        /*
            Create a class named ReplaceX, and write a program that asks user to enter
            a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();

         word = word.replace('x','a').replace('X','a');

        System.out.println(word);
    }
}
