package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBread = Math.ceil(numbGuests * 1.00 / 3);
        double easterEggs = numbGuests * 2;
        double priceEasterBread = easterBread * 4;
        double priceEasterEggs = easterEggs * 0.45;
        double totalSum = priceEasterBread + priceEasterEggs;

        if (totalSum <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n" +
                    "He has %.2f lv. left.", easterBread, easterEggs, budget - totalSum);
        }else {
            System.out.printf("Lyubo doesn't have enough money.%n" +
                    "He needs %.2f lv. more.", totalSum - budget);
        }
    }
}
