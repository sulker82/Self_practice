package day29_practies;

public class Toyota extends car {
    public Toyota(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    /*
    Create a class named Toyota
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Toyota" and rest of the fields will be set
					 based on the given arguments
					toString(): prints Toyota object info when the object is passed in the
					 print statement

     */
}
