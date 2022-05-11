package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double gas = 0.0;
        double gasoline = 0.0;
        double diesel = 0.0;
        double sumFuel = 0.0;

        switch (fuel) {
            case "Gas":
                gas = 0.93;
                if (clubCard.equals("Yes")) {
                    gas -= 0.08;
                }
                sumFuel = quantityFuel * gas;
                break;
            case "Gasoline":
                gasoline = 2.22;
                if (clubCard.equals("Yes")) {
                    gasoline -= 0.18;
                }
                sumFuel = quantityFuel * gasoline;
                break;
            case "Diesel":
                diesel = 2.33;
                if (clubCard.equals("Yes")) {
                    diesel -= 0.12;
                }
                sumFuel = quantityFuel * diesel;
                break;
        }
        if (quantityFuel >= 20 && quantityFuel <= 25) {
            sumFuel *= 0.92;
        }else if (quantityFuel > 25) {
            sumFuel *= 0.90;
        }
        System.out.printf("%.2f lv.", sumFuel);
    }
}
