package day06_practies;

public class MedianNumber {
    public static void main(String[] args) {

        int a =40,
                b =35,
                c =20;
        boolean aMedian = (a<b && a>c) ||  (a>b && a<c);
        boolean bMedian = (b<a && b>c) || (b>a && b<c);
        boolean cMedian = (c>a && c<b) || (c<a && c>b);

        if(aMedian){
            System.out.println(a+" is the median number");
        }

        if (bMedian) {
            System.out.println(b+" is the median number");
        }

        if(cMedian){ // TODO
            System.out.println(c+" is the median number");}


    }
}
/*
     int a = 67,
               b = 89,
               c = 43;

       boolean aMedian = (a<b && a>c) ||  (a>b && a<c);
       boolean bMedian = (b<a && b>c) || (b>a && b<c);
       boolean cMedian = (c>a && c<b) || (c<a && c>b);

       if(aMedian){
           System.out.println(a+" is the median number");
       }

        if (bMedian) {
            System.out.println(b+" is the median number");
        }

        if(cMedian){
            System.out.println(c+" is the median number");

 */
/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */
