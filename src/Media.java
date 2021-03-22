abstract class Media {
//    protected String showId;
    protected String type;          // type can be either Movie or TV Show
    protected String title;
    protected String director;
    protected String cast;
    protected String country;
    protected String dateAdded;
    protected int releaseYear;
    protected String rating;
    protected String genre;
    protected String description;

    public Media(String type, String title, String director, String cast, String country, int releaseYear, String rating, String genre, String description) {
//        setShowId(showId);
        setType(type);
        setTitle(title);
        setDirector(director);
        setCast(cast);
        setCountry(country);
//        setdateAdded(dateAdded);
        setReleaseYear(releaseYear);
        setRating(rating);
        setGenre(genre);
        setDescription(description);
    }

//    public String getshowId() {
//        return showId;
//    }
//
//    public void setShowId(String showId) {
//        this.showId = showId;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public String getdateAdded() {
//        return dateAdded;
//    }
//
//    public void setdateAdded(String dateAdded) {
//        this.dateAdded = dateAdded;
//    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "TV Show: " +  title + "; Director: " + director + "; cast: " + "; country: " + country + "; release " +
                "year: " + releaseYear + "; rating: " + rating + "; genre: " + genre + "; description: " + description;
    }
}
