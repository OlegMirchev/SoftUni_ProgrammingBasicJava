package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1701;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extra = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double sumDecor = budget * 0.10;
        double sumClothes = extra * priceClothes;

        if (extra > 150) {
            sumClothes *= 0.90;
        }

        double totalSum = sumDecor + sumClothes;

        if (totalSum > budget) {
            System.out.printf("Not enough money!%n" +
                    "Wingard needs %.2f leva more.", totalSum - budget);
        }else {
            System.out.printf("Action!%n" +
                    "Wingard starts filming with %.2f leva left.", budget - totalSum);
        }
    }
}
