package day16_practies;

public class shape {
    /*
    Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
     */
    public static void main(String[] args) {



            for (int j = 1; j < 11; j++) {

                for (int i = 0; i < j; i++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

    }
}
