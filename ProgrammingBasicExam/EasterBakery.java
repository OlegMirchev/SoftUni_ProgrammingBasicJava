package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double flour1KG = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        int numbEggs = Integer.parseInt(scanner.nextLine());
        int packetYeast = Integer.parseInt(scanner.nextLine());

        double priceFlour = flour1KG * kgFlour;
        double priceSugar = flour1KG * 0.75;
        double priceEggs = flour1KG * 1.10;
        double priceYeast = priceSugar * 0.20;
        double sumSugar = priceSugar * kgSugar;
        double sumEggs = priceEggs * numbEggs;
        double sumYeast = priceYeast * packetYeast;
        double totalSum = priceFlour + sumSugar + sumEggs + sumYeast;

        System.out.printf("%.2f", totalSum);
    }
}
