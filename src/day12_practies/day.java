package day12_practies;

public class day {
    public static void main(String[] args) {
        day(13);
    }
    /*
    Create a method named day that can display the name of the
    day based on the given number to the method, if the number is
    invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
     */
    public static void day(int num){
        if (num>=1&&num<=7){
        if(num == 1) {
            System.out.println("monday");
        }else if (num==2){
            System.out.println("tuesday");
        }else if (num==3){
            System.out.println("wednesday");
        }else if (num==4){
            System.out.println("thursday");
        }else if (num==5){
            System.out.println("friday");
        }else if (num==6) {
            System.out.println("saturday");
        }else {
            System.out.println("sunday");
        }

        }else{
            System.out.println("invalid");
        }
    }
}
