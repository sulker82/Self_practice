package day11_practies;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        /*
        Create a class named WithoutFirstChar. Ask user to enter two words.
        Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */
        Scanner input =new Scanner(System.in);

        System.out.println("first word");
        String fw = input.next();

        System.out.println("secon word");
        String sw = input.next();

        String result = fw.substring(1)+sw.substring(1);

        System.out.println(result);


      input.close();


    }
}
