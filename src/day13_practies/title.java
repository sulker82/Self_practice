package day13_practies;

public class title {
    public static void main(String[] args) {
        System.out.println(title("jAvA"));
    }

    /*
    Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
     */
    public static String title(String word){
        String result = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        return result;











      }





}