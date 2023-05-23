package day09_practies;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("how many total shares they have already?");
        int share = input.nextInt();

        System.out.println("how much their total value in the stock market is");
        double value = input.nextDouble();
        input.nextLine();

        System.out.println("name of the company they have the most shares in");
        String namecampany = input.nextLine();

        System.out.println("Your total stock market holding is $"+value+" which is made up of "+share+" shares."+"\n" +
                ""+namecampany+" is your company holdings");



        /*
            Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition
            should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in
        (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares.
            Apple INC is your company holdings"

         */
    }
}
