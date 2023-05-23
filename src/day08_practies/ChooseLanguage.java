package day08_practies;

public class ChooseLanguage {

    public static void main(String[] args) {

        int num =3;

        String result = (num>=1 && num<=5)?
                (num==1)? "Hello, thank for your call" :(num==2) ? "Hola, gracias para llamar"
                :(num==3)? "Merhaba, aradiginiz icin tesekkurler" :(num==4)? "Privet, spasibo za vash zvonok"
                :"Merci ,pour votre appel"
                        :"Invalid number";

        System.out.println(result);
        System.out.println("-----------------------------");

        int no =3;

        switch (no){

            case 1:
                System.out.println("Hello, thank for your call");
                break;
            case 2:
                System.out.println("Hola, gracias para llamar");
                break;
            case 3:
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
                break;
            case 4:
                System.out.println("Privet, spasibo za vash zvonok");
                break;
            case 5:
                System.out.println("Merci ,pour votre appel");
            default:
                System.out.println("invalid Number");

        }



    }
}
/*Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's
 		given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement*/
