package day29_practies;

public class Driver extends Employee {

    /*
    Create a custom Class named Driver
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints driver object info when the object is passed in the print
				 statement

     */
    public void driving(){
        System.out.println(getJobTitle()+" "+getName()+" is driving");
    }

}
