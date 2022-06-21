package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double priceCard = 0.0;

        if (gender.equals("m")) {
            switch (sport) {
                case "Gym":
                    priceCard = 42;
                    break;
                case "Boxing":
                    priceCard = 41;
                    break;
                case "Yoga":
                    priceCard = 45;
                    break;
                case "Zumba":
                    priceCard = 34;
                    break;
                case "Dances":
                    priceCard = 51;
                    break;
                case "Pilates":
                    priceCard = 39;
                    break;
            }
        }else if (gender.equals("f")) {
            switch (sport) {
                case "Gym":
                    priceCard = 35;
                    break;
                case "Boxing":
                case "Pilates":
                    priceCard = 37;
                    break;
                case "Yoga":
                    priceCard = 42;
                    break;
                case "Zumba":
                    priceCard = 31;
                    break;
                case "Dances":
                    priceCard = 53;
                    break;
            }
        }
        if (age <= 19) {
            priceCard *= 0.80;
        }
        if (sum >= priceCard) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.", priceCard - sum);
        }
    }
}
