package day29_practies;

public class Tester extends Employee{

    /*
     Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the
				 print statement

     */
    public void testing(){
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }
}
