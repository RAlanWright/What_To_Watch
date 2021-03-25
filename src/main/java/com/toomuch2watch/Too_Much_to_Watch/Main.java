package com.toomuch2watch.Too_Much_to_Watch;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Media> media = readMediaFromCSV("netflix_titles.csv");

        for (Media m : media) {
            System.out.println(m);
        }

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("outputTest.txt"));

            for (Media m : media) {
                pw.println(m);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem writing to file :(");
        }

    }

    private static List<Media> readMediaFromCSV(String fileName) {
        List<Media> media = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        System.out.println(pathToFile.toAbsolutePath());

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
            String line = br.readLine();

//            br.readLine(); // Ignore header

            while (line != null) {


                String[] attributes = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                Media mediaItem = createMedia(attributes);

                media.add(mediaItem);

                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return media;
    }

//    protected String showId;
//    protected String type;          // type can be either Movie or TV Show
//    protected String title;
//    protected String director;
//    protected String cast;
//    protected String country;
//    protected String dateAdded;
//    protected int releaseYear;
//    protected String rating;
//    protected String genre;
//    protected String description;

    private static Media createMedia(String[] metadata) {
        String type = metadata[1];
        String title = metadata[2];
        String director = metadata[3];
        String cast = metadata[4];
        String country = metadata[5];
//        String dateAdded = metadata[6];
        String releaseYear = metadata[7];
        String rating = metadata[8];
        String genre = metadata[10];
        String description = metadata[11];
        String duration = metadata[9];

//        System.out.println(metadata[1]);

        // Skip header line
//        if (metadata[0].equals("show_id")) {
//            return null;
//        }
//        if (metadata[1].equals("Movie")) {
//            // Ignore " min" for duration column
//            String[] movieDuration = metadata[9].split(" ");
//            // Only grab the int from movieDuration and parse it as int
//            int duration = Integer.parseInt(movieDuration[0]);
            return new Movie( type, title, director, cast, country, releaseYear, rating, duration, genre,
                    description);
//        }
//        else  {
//            return new Series(type, title, director, cast, country, releaseYear, rating, genre, description);
//        }
    }
}
