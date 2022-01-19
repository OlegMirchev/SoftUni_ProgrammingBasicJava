package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1001;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberries = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspsKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        double priceRasps = strawberries * 0.50;
        double priceOranges = priceRasps * 0.60;
        double priceBananas = priceRasps * 0.20;
        double sumBananas = bananasKg * priceBananas;
        double sumOranges = orangesKg * priceOranges;
        double sumRasps = raspsKg * priceRasps;
        double sumStrawberries = strawberriesKg * strawberries;
        double totalSum = sumBananas + sumOranges + sumRasps + sumStrawberries;

        System.out.printf("%.2f", totalSum);




    }
}
