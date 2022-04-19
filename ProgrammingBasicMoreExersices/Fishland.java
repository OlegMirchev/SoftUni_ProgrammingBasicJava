package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceMackerel = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double priceBonito = priceMackerel * 1.60;
        double sumBonito = bonitoKg * priceBonito;
        double priceHorseMackerel = priceToy * 1.80;
        double sumHorseMackerel = horseMackerelKg * priceHorseMackerel;
        double sumMussels = musselsKg * 7.50;
        double totalSum = sumBonito + sumHorseMackerel + sumMussels;

        System.out.printf("%.2f", totalSum);

    }

}
