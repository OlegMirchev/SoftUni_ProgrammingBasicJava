package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destinations = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (season.equals("Winter")) {
            switch (destinations) {
                case "Dubai":
                    price = 45000;
                    price *= days;
                    break;
                case "Sofia":
                    price = 17000;
                    price *= days;
                    break;
                case "London":
                    price = 24000;
                    price *= days;
                    break;
            }
        }else if (season.equals("Summer")) {
            switch (destinations) {
                case "Dubai":
                    price = 40000;
                    price *= days;
                    break;
                case "Sofia":
                    price = 12500;
                    price *= days;
                    break;
                case "London":
                    price = 20250;
                    price *= days;
                    break;
            }
        }
        if (destinations.equals("Dubai")) {
            price *= 0.70;
        }else if (destinations.equals("Sofia")) {
            price *= 1.25;
        }
        if (price <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - price);
        }else {
            System.out.printf("The director needs %.2f leva more!", Math.abs(budget - price));
        }
    }
}
