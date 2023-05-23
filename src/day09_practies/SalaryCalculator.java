package day09_practies;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter his/her hourlyRate");
        int hourlyRate = input.nextInt();

        System.out.println("how many hours he/she works in a week");
        int weeklyHours = input.nextInt();

        System.out.println("enter state tax");
        double stateTaxRate = input.nextDouble()/100;

        System.out.println("enter federal tax");
        double federalTaxRate = input.nextDouble() / 100;

        double salary = hourlyRate * weeklyHours * 52; // 52 weeks in a year
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

        /*
            Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
         */
    }
}
