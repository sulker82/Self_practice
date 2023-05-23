package day13_practies;

public class isOdd {

    public static void main(String[] args) {

        System.out.println(isOdd(100));

    }

    /*
    Create a method named isOdd, that can return true if a number is an
    odd number, otherwise returns false

     */
    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }

}
