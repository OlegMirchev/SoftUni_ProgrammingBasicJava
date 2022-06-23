package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceChicken = chickenMenu * 10.35;
        double priceFish = fishMenu * 12.40;
        double priceVegetarian = vegetarianMenu * 8.15;
        double allSumMenu = priceChicken + priceFish + priceVegetarian;
        double priceDesert = allSumMenu * 0.20;
        double totalSum = allSumMenu + priceDesert + 2.50;

        System.out.printf("Total: %.2f", totalSum);
    }
}
