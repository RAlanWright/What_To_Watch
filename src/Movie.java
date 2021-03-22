public class Movie extends Media {
    protected int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Movie(String type, String title, String director, String cast, String country,
                 int releaseYear, String rating, int duration, String genre, String description) {
        super(type, title, director, cast, country, releaseYear, rating, genre, description);
        setDuration(duration);
    }

    @Override
    public String toString() {
        return super.toString() + "; duration: " + duration;
    }
}
