package day13_practies;

public class combine {
    public static void main(String[] args) {

        String str3 = combine("java", "apple");

        System.out.println(str3);


        String s1 = "" + true; //"true"

        String s2 = "" + 'e'; // "e"
    }

    /*
    Create a method named combine that can take two string and
    hen add them together and returns it.
        But if the last letter of the first word and the first
        letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

     */
    public static String combine(String str1, String str2) {

        String result;

        /*
        if( str1.endsWith(  ""+str2.charAt(0) )   ){  // if the first string ends
        with the first character of the second string
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }
         */

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) { // if the last character
            // in first string is equal to the first character of the second string
            result = str1 + str2.substring(1); // first character of the second
            // string should be excluded in the concatenation
        } else {
            result = str1 + str2;
        }


        return result;
    }


}
