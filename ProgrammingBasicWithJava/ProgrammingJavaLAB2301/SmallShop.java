package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB2301;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    quantity *= 0.50;
                    break;
                case "water":
                    quantity *= 0.80;
                    break;
                case "beer":
                    quantity *= 1.20;
                    break;
                case "sweets":
                    quantity *= 1.45;
                    break;
                case "peanuts":
                    quantity *= 1.60;
                    break;
            }
        }else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    quantity *= 0.40;
                    break;
                case "water":
                    quantity *= 0.70;
                    break;
                case "beer":
                    quantity *= 1.15;
                    break;
                case "sweets":
                    quantity *= 1.30;
                    break;
                case "peanuts":
                    quantity *= 1.50;
                    break;
            }
        }else if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    quantity *= 0.45;
                    break;
                case "water":
                    quantity *= 0.70;
                    break;
                case "beer":
                    quantity *= 1.10;
                    break;
                case "sweets":
                    quantity *= 1.35;
                    break;
                case "peanuts":
                    quantity *= 1.55;
                    break;
            }
        }
        System.out.printf("%f", quantity);
    }
}
