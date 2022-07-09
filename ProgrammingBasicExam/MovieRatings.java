package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbFilms = Integer.parseInt(scanner.nextLine());
        double sumRating = 0.0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        String nameHighest = "";
        String nameLowest = "";

        for (int i = 1; i <= numbFilms; i++) {
            String nameFilm = scanner.nextLine();
            double ratingFilm = Double.parseDouble(scanner.nextLine());
            sumRating += ratingFilm;
            if (ratingFilm > max) {
                max = ratingFilm;
                nameHighest = nameFilm;
            } else if (ratingFilm < min) {
                min = ratingFilm;
                nameLowest = nameFilm;
            }
        }
        double averageRating = sumRating / numbFilms;
        System.out.printf("%s is with highest rating: %.1f%n",nameHighest, max);
        System.out.printf("%s is with lowest rating: %.1f%n",nameLowest, min);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
