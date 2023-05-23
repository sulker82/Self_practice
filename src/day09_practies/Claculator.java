package day09_practies;

import java.util.Scanner;

public class Claculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number");
        double num = input.nextDouble();
        System.out.println("enter a math operator");
        char ch = input.next().charAt(0);
        System.out.println("enter the second number");
        double num2 = input.nextDouble();




        switch (ch){
            case '-':
                System.out.println(num-num2);
                break;

            case '+':
                System.out.println(num+num2);
                break;

            case '*':
                System.out.println(num*num2);
                break;

            case '/':
                System.out.println(num-num2);
                break;

            default:
                System.out.println("Invalid Operator");

        }
        input.close();




        /*
            reate a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
         */

    }
}