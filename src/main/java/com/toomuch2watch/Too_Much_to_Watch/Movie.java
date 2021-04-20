package com.toomuch2watch.Too_Much_to_Watch;

public class Movie extends Media {
    protected String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Movie(String type, String title, String director, String cast, String country,
                 String releaseYear, String rating, String duration, String genre, String description) {
        super(type, title, director, cast, country, releaseYear, rating, genre, description);
        setDuration(duration);
    }

    @Override
    public String toString() {
        return super.toString() + "; duration: " + duration + " minutes";
    }
}
