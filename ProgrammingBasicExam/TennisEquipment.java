package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tennisRocket = Double.parseDouble(scanner.nextLine());
        int numbTennisRockets = Integer.parseInt(scanner.nextLine());
        int shoes = Integer.parseInt(scanner.nextLine());

        double priceTennisRocket = tennisRocket * numbTennisRockets;
        double oneShoes = tennisRocket * 1 / 6;
        double priceShoes = shoes * oneShoes;
        double sum = priceTennisRocket + priceShoes;
        double others = sum * 0.20;
        double totalSum = priceTennisRocket + priceShoes + others;
        double priceDjokovic = totalSum * 1 / 8;
        double priceSponsors = totalSum * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(priceDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(priceSponsors));

    }
}
