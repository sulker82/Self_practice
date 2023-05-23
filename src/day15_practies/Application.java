package day15_practies;

import java.util.Scanner;

public class Application {
    /*
    you are writing a code for the log-in function of the Cydeo Application, assume
    that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
to have three attempts to enter correct credentials and if all three attempts are failed,
then print "Your account is lucked."

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name");
        String u = input.next();
        System.out.println("Enter your pasword");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");

        } else {
            for (int i = 0; i < 3; i++) {

                System.out.println("Enter user name");
                u = input.next();
                System.out.println("Enter your pasword");
                p = input.next();
                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Logged in");
                }
            }

            if (!(u.equals("Cydeo") && p.equals("Cydeo123"))) {
                System.out.println("Your account now is locked, please contact with the support team");


            }

        }
        input.close();
    }
}
