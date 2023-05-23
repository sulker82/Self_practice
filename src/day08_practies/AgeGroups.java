package day08_practies;

public class AgeGroups {

    public static void main(String[] args) {


        int ageGrup = 97;

        String result = (ageGrup >= 1 && ageGrup <= 2) ? "infant" : (ageGrup >= 3 && ageGrup <= 5) ? "Todler" :
                (ageGrup >= 6 && ageGrup <= 9) ? "Kid" : (ageGrup >= 10 && ageGrup <= 12) ? "Pre teen"
                        : (ageGrup >= 13 && ageGrup <= 17) ? "Teenager" :(ageGrup >=18 && ageGrup <=20)? "Young"
                :(ageGrup >=21 && ageGrup <=39)? "Adult" :(ageGrup >=40 && ageGrup <=49) ?"Young Middle-Aged Adult "
                        :(ageGrup >=50 && ageGrup <=54) ? "Middle-Aged Adult"  :(ageGrup >=55 && ageGrup <=64) ?
                        "Very Young Senior Citizen" :(ageGrup >=65 && ageGrup <=74) ?  "Young Senior Citizen"
                 :(ageGrup >=75 && ageGrup <=84) ? "Senior Citizen" : "Old Senior Citizen ";

        System.out.println(result);
    }
}
/*
    Create a class called AgeGroups
		write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary
 */
