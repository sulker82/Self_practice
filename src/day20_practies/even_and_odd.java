package day20_practies;

import java.util.Arrays;

public class even_and_odd {
    /*
    Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int countOdd = 0,
                countEven = 0;

        for (int each : arr) {
            if(each%2 ==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println(Arrays.toString(arr) +" has "+countEven+" even numbers and "+countOdd+" odd numbers");

    }
}
