package ProgrammingBasic2021.TasksFromExercise.ProgammingJavaJan2021Ex2401;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String seasons = scanner.nextLine();
        int numberFishers = Integer.parseInt(scanner.nextLine());
        double rentShip = 0.0;

        switch (seasons) {
            case "Spring":
                rentShip = 3000;
                break;
            case "Summer":
            case "Autumn":
                rentShip = 4200;
                break;
            case "Winter":
                rentShip = 2600;
        }
        if (numberFishers <= 6) {
            rentShip *= 0.90;
        } else if (numberFishers <= 11) {
            rentShip *= 0.85;
        } else {
            rentShip *= 0.75;
        }
        if (numberFishers % 2 == 0 && !seasons.equals("Autumn")) {
            rentShip *= 0.95;
        }
        if (budget >= rentShip) {
            double left = budget - rentShip;
            System.out.printf("Yes! You have %.2f leva left.", left);
        }else {
            double needed = rentShip - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needed);
        }
    }
}
