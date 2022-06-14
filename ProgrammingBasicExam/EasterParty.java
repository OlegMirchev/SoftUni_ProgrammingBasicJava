package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbGuests = Integer.parseInt(scanner.nextLine());
        double priceCover1Person = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (numbGuests >= 10 && numbGuests <= 15) {
            priceCover1Person *= 0.85;
        }else if (numbGuests >= 15 && numbGuests <= 20) {
            priceCover1Person *= 0.80;
        }else if (numbGuests > 20) {
            priceCover1Person *= 0.75;
        }
        double priceCake = budget * 0.10;
        double totalSum = numbGuests * priceCover1Person + priceCake;

        if (totalSum <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - totalSum);
        }else {
            System.out.printf("No party! %.2f leva needed.", totalSum - budget);
        }
    }
}
