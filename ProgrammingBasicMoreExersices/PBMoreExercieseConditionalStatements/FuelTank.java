package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        boolean isValid = false;
        if (litres >= 25) {
            if (fuel.equals("Diesel") || fuel.equals("Gasoline") || fuel.equals("Gas")) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
                isValid = true;
            }
        } else if (litres < 25) {
            if (fuel.equals("Diesel") || fuel.equals("Gasoline") || fuel.equals("Gas")) {
                System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
                isValid = true;
            }
        }
        if (!isValid) {
            System.out.println("Invalid fuel!");
        }
    }
}
