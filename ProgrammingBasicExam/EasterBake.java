package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbEasterBake = Integer.parseInt(scanner.nextLine());
        int neededSugar = 0;
        int neededFlour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= numbEasterBake; i++) {
            int quantitySugar = Integer.parseInt(scanner.nextLine());
            int quantityFlour = Integer.parseInt(scanner.nextLine());
            if (quantitySugar > maxSugar) {
                maxSugar = quantitySugar;
            }
            if (quantityFlour > maxFlour) {
                maxFlour = quantityFlour;
            }
            neededSugar += quantitySugar;
            neededFlour += quantityFlour;
        }
        double numbPacketSugar = Math.ceil(neededSugar * 1.00 / 950);
        double numbPacketFlour = Math.ceil(neededFlour * 1.00 / 750);

        System.out.printf("Sugar: %.0f%n", numbPacketSugar);
        System.out.printf("Flour: %.0f%n", numbPacketFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);

    }
}
