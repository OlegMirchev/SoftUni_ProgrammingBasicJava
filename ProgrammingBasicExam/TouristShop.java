package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String nameProduct = scanner.nextLine();
        double sumOutfit = 0.0;
        int counterOutfit = 0;
        boolean isValid = false;

        while (!nameProduct.equals("Stop")) {
            double priceProduct = Double.parseDouble(scanner.nextLine());
            counterOutfit++;

            if (counterOutfit % 3 == 0) {
                priceProduct /= 2;
            }
            sumOutfit += priceProduct;

            if (sumOutfit > budget) {
                isValid = true;
                break;
            }
            nameProduct = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("You don't have enough money!%n" +
                    "You need %.2f leva!", sumOutfit - budget);
        }else {
            System.out.printf("You bought %d products for %.2f leva.", counterOutfit, sumOutfit);
        }
    }
}
