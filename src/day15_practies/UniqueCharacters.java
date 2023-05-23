package day15_practies;

public class UniqueCharacters {
    /*
    Create a class called UniqueCharacters, Write a program that can return the
     unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

     */
    public static void main(String[] args) {


        String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {       // i: index numbers of str
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }

        }


        System.out.println(unique);
    }
}

