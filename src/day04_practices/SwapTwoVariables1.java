package day04_practices;

public class SwapTwoVariables1 {

    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        int z =x;

        x = y;
        y = z; //TODO

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int a = 20;
        int b = 30;

        int c = a;

        a =b ;
        b =c ;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
/*
    Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z

    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10

 */
