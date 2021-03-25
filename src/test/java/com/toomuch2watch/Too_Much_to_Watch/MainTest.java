package com.toomuch2watch.Too_Much_to_Watch;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scnr = null;

        try {
            scnr = new Scanner(new FileInputStream("netflix_titles.csv"));
        }
        catch (FileNotFoundException e) {
            System.out.println("File was unable to be opened, sorry :(");
            System.exit(1);
//            e.printStackTrace();
        }

        while (scnr.hasNext()) {
            String thisLine = scnr.nextLine();
            String[] result = thisLine.split(",");
            System.out.println(Arrays.toString(result));
            if (result[0].equals("s30")) {
                break;
            }
        }
    }
}
