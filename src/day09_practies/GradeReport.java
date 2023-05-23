package day09_practies;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter the his score");
        int score = input.nextInt();



        String result =(score>=0 && score<=100)?
            (score>=90)? "A" :(score>=80)?"B" :(score>=70)? "C" :(score>=60)? "D" : "F"

                :"Invalid";
        System.out.println(result);
        input.close();


        /*
            Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
         */
    }
}
