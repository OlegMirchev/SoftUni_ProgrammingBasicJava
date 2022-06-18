package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numbNights = Integer.parseInt(scanner.nextLine());
        double priceNights = Double.parseDouble(scanner.nextLine());
        int percentCharge = Integer.parseInt(scanner.nextLine());

        double nights = numbNights * priceNights;

        if (numbNights > 7) {
            nights *= 0.95;
        }
        double charges = (budget * percentCharge) / 100;
        double sum = nights + charges;

        if (sum <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - sum);
        }else {
            System.out.printf("%.2f leva needed.", Math.abs(budget - sum));
        }
    }
}
