package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceBaggage20kg = Double.parseDouble(scanner.nextLine());
        double kgBaggage = Double.parseDouble(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        int numberBaggage = Integer.parseInt(scanner.nextLine());

        if (kgBaggage < 10) {
            priceBaggage20kg *= 0.20;
        }else if (kgBaggage <= 20) {
            priceBaggage20kg *= 0.50;
        }
        if (day < 7) {
            priceBaggage20kg *= 1.40;
        }else if (day <= 30) {
            priceBaggage20kg *= 1.15;
        }else {
            priceBaggage20kg *= 1.10;
        }
        double totalSum = priceBaggage20kg * numberBaggage;
        System.out.printf("The total price of bags is: %.2f lv.",totalSum);
    }
}
