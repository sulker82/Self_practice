package day28_practies;

import day17_practies.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(
                new Candy("M&M", 60, 1.5, false),
                new Candy("M&M", 50, 0.5, false),
                new Candy("M&M", 40, 2.5, false),
                new Candy("M&M", 30, 3.5, false),
                new Candy("M&M", 20, 2.75, false)
        ));


        for (Candy candy : candies) {
            System.out.println(candy.getBrand() + " : " + candy.getPrice());
        }

        System.out.println("---------------------------------------------------------------");


        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println(rectangle);

        rectangle.setLength(10);
        rectangle.setWidth(20);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        System.out.println(rectangle);


        System.out.println("-------------------------------------------");

        Square square =  new Square(5);

        System.out.println(square);

        square.setSide(10);
        System.out.println(square.getSide());

        System.out.println(square);



    }

    }
