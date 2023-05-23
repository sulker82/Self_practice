package day07_practies;

public class GradeReport {

    public static void main(String[] args) {

        int score = 80;

        if(score>0 && score<100){

            if(score>=90) System.out.println("Your grade is a A");
            else if(score>=80) System.out.println("Your grade is a B");
            else if (score>=70) System.out.println("Your grade is a C");
            else if (score>=60) System.out.println("Your grade is a D");
            else if (score>=50) System.out.println("Your grade is a F");



            }else {
            System.out.println("invalid");

        }
        }
    }
/*
    1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student.
(only if the given score is a valid score, then print the name of the
month. Otherwise print Invalid)

Ex:

score = 95

output:
Your grade is A
 */
