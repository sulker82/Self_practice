package day04_practices;

public class SalaryCalculates2 {
    public static void main(String[] args) {
         double hourlyRate = 50,
                 weeklyHours = 45,
                 stateTaxRate = 6,
                 federalTaxRate = 26;

         
         double salaryBeforeTax = hourlyRate * weeklyHours * 52;
         double stateTax = salaryBeforeTax * stateTaxRate  / 100;
         double federalTax = salaryBeforeTax * federalTaxRate / 100;
         double totalTax = stateTax + federalTax ;
         double salaryAfterTax = salaryBeforeTax -totalTax;
        System.out.println(salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
        System.out.println("----------------------------------------");

        System.out.println("Gross pay is: $"+ salaryBeforeTax+"\n" +
                "Federal tax is: $"+ federalTax+"\n" +
                "State tax is: $"+stateTax+"\n" +
                "Total tax is: $"+totalTax+"\n" +
                "Net income is: $"+salaryAfterTax);

                


         



    }


}
/*
     1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)
					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: $79560
 */