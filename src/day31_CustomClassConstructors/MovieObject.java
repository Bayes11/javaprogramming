package day31_CustomClassConstructors;

import java.util.Arrays;

public class MovieObject {
    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 25" , "10/25/2021", "Kuzzat Altay" );

        String [] casts = {"Asiya", "Basit", "Muhtar", "Bayes"};

        movie1.addcasts(casts);

        System.out.println("movie1 = " + movie1);
    }
}
/*
  3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */