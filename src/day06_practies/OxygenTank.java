package day06_practies;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygenTank =60;
            String result ="";


        if(oxygenTank>=50 && oxygenTank<=59){
            result="Be careful now you at at 50%";
        }
        if(oxygenTank>=60 && oxygenTank<=69){
            result="Start to head back";
        }
        if(oxygenTank>=70 && oxygenTank<=79){
            result="Don't go too far";
        }
        if(oxygenTank>=80 && oxygenTank<=89){
            result="Still okay";
        }if (oxygenTank>=90){
            result="Your tank is full";

        }
        System.out.println(result);

    }
}
/*
    Create a class named OxygenTank. You are diving in the ocean.
    Your oxygen tank has a certain level (number) and you must print
     a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */
