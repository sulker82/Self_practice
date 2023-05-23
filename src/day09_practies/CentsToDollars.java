package day09_practies;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents");
        int cents = input.nextInt();

        input.close(); // we no longer need scanner after this line

        int dollar = cents / 100;

        cents -= dollar * 100; // or: cents = cents - (dollar * 100)

        System.out.println(dollar+" dollars and "+cents+" cents");


        /*
            Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
         */
    }
}
