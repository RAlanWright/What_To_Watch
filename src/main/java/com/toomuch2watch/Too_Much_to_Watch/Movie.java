package com.toomuch2watch.Too_Much_to_Watch;

public class Movie extends Media {
    protected String duration;


    public Movie(String showId, String type, String title, String director, String cast, String country, String dateAdded, int releaseYear, String rating, String genre, String description) {
        super(showId, type, title, director, cast, country, dateAdded, releaseYear, rating, genre, description);
    }
}
