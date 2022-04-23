package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double tickets = 0.0;

        if (people >= 1 && people <= 4) {
            budget *= 0.25;
        }else if (people <= 9) {
            budget *= 0.40;
        }else if (people <= 24) {
            budget *= 0.50;
        }else if (people <= 49) {
            budget *= 0.60;
        }else {
            budget *= 0.75;
        }
        switch (category) {
            case "VIP":
                tickets = 499.99;
                tickets *= people;
                break;
            case "Normal":
                tickets = 249.99;
                tickets *= people;
                break;
        }
        if (budget >= tickets) {
            System.out.printf("Yes! You have %.2f leva left.", budget - tickets);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - tickets));
        }
    }
}
