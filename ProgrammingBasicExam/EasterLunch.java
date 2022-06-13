package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbEasterBread = Integer.parseInt(scanner.nextLine());
        int numbEggs = Integer.parseInt(scanner.nextLine());
        int cookiesKG = Integer.parseInt(scanner.nextLine());

        double priceEasterBread = numbEasterBread * 3.20;
        double priceEggs = numbEggs * 4.35;
        double priceCookies = cookiesKG * 5.40;
        double paintEggs = numbEggs * 12 * 0.15;
        double totalSum = priceEasterBread + priceEggs + priceCookies + paintEggs;

        System.out.printf("%.2f", totalSum);
    }
}
