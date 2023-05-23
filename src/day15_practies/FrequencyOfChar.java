package day15_practies;

import java.util.Scanner;

public class FrequencyOfChar {
    /*
    Create a class named FrequencyOfChar and Write a program that asks user
     to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String str = "acbacbc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str

            if( str.charAt(i) == ch ){
                // if the character of the string is equal to the given character, it means the
                // given character has appeared in the string
                count++;
            }

        }

        input.close();
        System.out.println(count);


    }
}
