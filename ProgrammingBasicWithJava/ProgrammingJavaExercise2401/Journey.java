package ProgrammingBasic2021.TasksFromExercise.ProgammingJavaJan2021Ex2401;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String seasons = scanner.nextLine();
        String destinations = "";
        String place = "";

        if (budget <= 100) {
            destinations = "Bulgaria";
            switch (seasons) {
                case "summer":
                    budget *= 0.30;
                    break;
                case "winter":
                    budget *= 0.70;
                    break;
            }
        } else if (budget <= 1000) {
            destinations = "Balkans";
            switch (seasons) {
                case "summer":
                    budget *= 0.40;
                    break;
                case "winter":
                    budget *= 0.80;
                    break;
            }
        } else if (budget > 1000) {
            destinations = "Europe";
            switch (seasons) {
                case "summer":
                case "winter":
                    budget *= 0.90;
                    break;
            }

        }
        if (seasons.equals("summer")) {
            place = "Camp";
            if (destinations.equals("Europe")) {
                place = "Hotel";
            }
        }else if (seasons.equals("winter")) {
            place = "Hotel";
        }


        System.out.printf("Somewhere in %s%n", destinations);
        System.out.printf("%s - %.2f", place, budget);
    }
}
