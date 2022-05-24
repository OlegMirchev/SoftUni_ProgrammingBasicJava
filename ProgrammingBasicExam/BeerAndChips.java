package ProgrammingBasic2021.TasksFromExercise.pExam;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFan = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int numbBeers = Integer.parseInt(scanner.nextLine());
        int numbChips = Integer.parseInt(scanner.nextLine());
        String output = "";
        double priceBeers = 1.20 * numbBeers;
        double priceChips = priceBeers * 0.45;
        double totalPriceChips = Math.ceil(priceChips * numbChips);
        double totalSum = priceBeers + totalPriceChips;
        double change = Math.abs(budget - totalSum);

        if (totalSum <= budget) {
            output = String.format("%s bought a snack and has %.2f leva left.", nameFan, change);

        }else {
            output = String.format("%s needs %.2f more leva!", nameFan, change);
        }
        System.out.println(output);

    }
}
