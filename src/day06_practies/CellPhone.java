package day06_practies;

public class CellPhone {
    public static void main(String[] args) {

        String brand ="Apple",
                model ="Iphone X",
                colar ="Black";
        double storage= 1_200.99;
        int storagee =128;
        boolean hascamera = true;
        char simtipe ='A';


        System.out.println("We have an brand new "+model+" from "+brand+"\n" +
                "It comes in the color "+colar+" and has "+storagee+"GB memory"+"\n" +
                "It has a camera "+hascamera+" and operates with the "+simtipe+" type sim"+"\n" +
                "Get your very own "+model+" for only $"+storage);





    }
}
/*
      CellPhone [variables, concatenation]

	Declare and assign the following variables:
		brand, model, color, price, storage, has camera, sim type (A, B, or C)

	Print out an advertisement post about the phone in this format:
		-> For extra practice also create this advertisement in a reusable way

		ex: if the given data was this: Apple, IPhone X, Black, 1200.99, 128, true, A
		the output would be:

		We have an brand new IPhone X from Apple
		It comes in the color Black and has 128GB memory
		It has a camera and operates with the "A" type sim
		Get your very own IPhone X for only $1200.99
 */
