package day07_practies;

public class GradeLevel {

    public static void main(String[] args) {
        byte number =9;

        String result ="";


        if(number>0 && number<18){

            if(number>0 && number<6)
                result= "Elementary school";
            else if(number>=6&&number<9)
                result="Middle school";
            else if (number>=9&&number<13)
                result="High school";
            else if(number>=13&&number<17){
                String college = "College";
                result= college;
            }else{
                System.out.println("Grad School");
            }

        }else{result="invalid";

        }
        System.out.println(result);


    }
}
/*
    Create a class called GradeLevel, Given a number(byte) grade level determine
     and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
