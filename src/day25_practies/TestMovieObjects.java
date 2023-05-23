package day25_practies;

import java.time.LocalDate;

public class TestMovieObjects {

    /*
    create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie

     */
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(3, 5, 8, true);

        Carpet carpet2 = new Carpet(10, 20, 10, false);


        System.out.println(carpet1);
        System.out.println(carpet2);




        String gene = "Adventure, Comedy, Thriller";
        String title = "Java Developer: Zero to Hero";
        String[] casts = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie movie1 = new Movie("USA", title, gene, LocalDate.of(2022, 4, 18), "Kuzzat Altay");
        movie1.addCasts(casts);

        System.out.println(movie1);




    }

}
