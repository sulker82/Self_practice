package day13_practies;

public class max {
    public static void main(String[] args) {

        System.out.println(max(20,30));
    }

    /*
    Create a method named max, that can return the maximum number between two numbers
     */
    public static int max (int num1,int num2){

        if(num1>num2){
            return num1;
        }
        return num2;
    }

}
