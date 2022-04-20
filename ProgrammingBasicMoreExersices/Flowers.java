package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String seasons = scanner.nextLine();
        String dayFestival = scanner.nextLine();
        double priceChrysanthemums = 0.0;
        double priceRoses = 0.0;
        double priceTulips = 0.0;
        double allFlowers = chrysanthemums + roses + tulips;

        switch (seasons) {
            case "Spring":
            case "Summer":
                priceChrysanthemums = 2.00;
                priceRoses = 4.10;
                priceTulips = 2.50;
                break;
            case "Autumn":
            case "Winter":
                priceChrysanthemums = 3.75;
                priceRoses = 4.50;
                priceTulips = 4.15;
                break;
        }
        double bouquet = (chrysanthemums * priceChrysanthemums) + (roses * priceRoses) + (tulips * priceTulips);
        if (dayFestival.equals("Y")) {
            bouquet *= 1.15;
        }
        if (tulips > 7 && seasons.equals("Spring")) {
            bouquet *= 0.95;
        }else if (roses >= 10 && seasons.equals("Winter")) {
            bouquet *= 0.90;
        }
        if (allFlowers > 20) {
            bouquet *= 0.80;
        }
        bouquet += 2;

        System.out.printf("%.2f", bouquet);
    }
}
