package day08_practies;

public class NumberToWord {

    public static void main(String[] args) {

        int num = 6;
        String result =(num==1) ? "one" : (num==2) ? "two" : (num==3) ? "three" : (num==4) ? "fore" :
                (num==5) ? "five" : (num==6) ? "six" : (num==7) ? "seven" : (num==8) ? "eight" : "nine";
        System.out.println(result);



    }
}
/*
    Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
 */
