package day11_practies;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord = input.next();

        System.out.println("Enter your second word");
        String secondWord = input.next();

        input.close();
        String result ="";

        if(firstWord.charAt( firstWord.length()-1) == secondWord.charAt(0)){
            result = firstWord+ secondWord.substring(1);
        }else{
            result = firstWord+secondWord;
        }

        System.out.println(result);


        /*
        Create a class named CombineWords. Ask user to enter two words.
        Then add them together and print.
    But if the last letter if the first word and the first letter of the
     last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */
    }
}
