package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drinks = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numbDrinks = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (drinks.equals("Espresso")) {
            switch (sugar) {
                case "Without":
                    price = 0.90;
                    price *= numbDrinks;
                    break;
                case "Normal":
                    price = 1.00;
                    price *= numbDrinks;
                    break;
                case "Extra":
                    price = 1.20;
                    price *= numbDrinks;
                    break;
            }
        }else if (drinks.equals("Cappuccino")) {
            switch (sugar) {
                case "Without":
                    price = 1.00;
                    price *= numbDrinks;
                    break;
                case "Normal":
                    price = 1.20;
                    price *= numbDrinks;
                    break;
                case "Extra":
                    price = 1.60;
                    price *= numbDrinks;
                    break;
            }
        }else if (drinks.equals("Tea")) {
            switch (sugar) {
                case "Without":
                    price = 0.50;
                    price *= numbDrinks;
                    break;
                case "Normal":
                    price = 0.60;
                    price *= numbDrinks;
                    break;
                case "Extra":
                    price = 0.70;
                    price *= numbDrinks;
                    break;
            }
        }
        if (sugar.equals("Without")) {
            price *= 0.65;
        }
        if (drinks.equals("Espresso") && numbDrinks >= 5) {
            price *= 0.75;
        }
        if (price > 15) {
            price *= 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", numbDrinks, drinks, price);
    }
}
