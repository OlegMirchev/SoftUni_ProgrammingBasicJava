package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String seasons = scanner.nextLine();
        String accommodations = "";
        String locations = "";

        if (budget <= 1000) {
            accommodations = "Camp";
            switch (seasons) {
                case "Summer":
                    locations = "Alaska";
                    budget *= 0.65;
                    break;
                case "Winter":
                    locations = "Morocco";
                    budget *= 0.45;
                    break;
            }
        }else if (budget <= 3000) {
            accommodations = "Hut";
            switch (seasons) {
                case "Summer":
                    locations = "Alaska";
                    budget *= 0.80;
                    break;
                case "Winter":
                    locations = "Morocco";
                    budget *= 0.60;
                    break;
            }
        }else {
            accommodations = "Hotel";
            switch (seasons) {
                case "Summer":
                    locations = "Alaska";
                    budget *= 0.90;
                    break;
                case "Winter":
                    locations = "Morocco";
                    budget *= 0.90;
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f",locations, accommodations, budget);
    }
}
