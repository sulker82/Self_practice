package day13_practies;

public class min {
    public static void main(String[] args) {

        System.out.println(min(30,40));
    }

    /*
     Create a method named min, that can return the minimum number between two numbers

     */
    public static int min(int n1,int n2){

        if(n1<n2){
            return n1;
        }
        return n2;
    }
}
