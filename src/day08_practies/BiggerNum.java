package day08_practies;

public class BiggerNum {

    public static void main(String[] args) {

        int o =23,
                d =24,
                s =122;
        String re ="";
        if(o>d && o>s){
            re="o is big";
        }else if(d>o && d>s){
            re="d is big";
        }else{
            re="s is big";
        }
        System.out.println(re);

        System.out.println("--------------------");

        int n1 = 14,
                n2 = 44,
                n3 = 12;//todo


        String result = (n1 != n2 && n1 != n3 && n2 != n1 && n2 != n3 && n3 != n1 && n3 != n2 )?
                (n1 > n2 && n1 > n3) ? "n1 is bigger" : (n2 > n1 && n2 > n3) ? "n2 is bigger" : "n3 is bigger"
                : " Please enter unequal numbers";

        System.out.println(result);



    }
}
/*
    Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */
