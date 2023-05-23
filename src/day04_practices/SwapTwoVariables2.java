package day04_practices;

public class SwapTwoVariables2 {

    public static void main(String[] args) {

        int a = 10; //TODO
        int b = 15;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);

        int aa =20;
        int bb = 30;

        aa= aa+bb;
        bb= aa-bb;
        aa= aa-bb;

        System.out.println(aa);
        System.out.println(bb);


    }
}
/*
    Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10

 */
