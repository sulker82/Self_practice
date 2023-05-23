package day13_practies;

public class isEven {
    public static void main(String[] args) {
        System.out.println(isEven(18));

    }

    /*
    Create a method named isEven, that can return true if
    a number is an even number, otherwise returns false

     */
    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
/*
    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }
 */