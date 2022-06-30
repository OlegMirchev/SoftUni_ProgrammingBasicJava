package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budge = Double.parseDouble(scanner.nextLine());
        int numbSupernumerary = Integer.parseInt(scanner.nextLine());
        double supernumeraryClothes = Double.parseDouble(scanner.nextLine());

        double decor = budge * 0.10;
        double sumClothes = numbSupernumerary * supernumeraryClothes;

        if (numbSupernumerary >= 150) {
            sumClothes *= 0.90;
        }
        double totalSum = decor + sumClothes;

        if (budge < totalSum) {
            System.out.printf("Not enough money!%n" +
                    "Wingard needs %.2f leva more.", Math.abs(totalSum - budge));
        }else {
            System.out.printf("Action!%n" +
                    "Wingard starts filming with %.2f leva left.", budge - totalSum);
        }
    }
}
