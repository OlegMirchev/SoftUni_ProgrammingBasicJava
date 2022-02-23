package ProgrammingBasic2021.TasksFromExercise.ProgammingJavaJan2021Ex2401;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int numbFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (flowers.equals("Roses")) {
            price = numbFlowers * 5;
            if (numbFlowers > 80) {
                price *= 0.90;
            }
        }else if (flowers.equals("Dahlias")) {
            price = numbFlowers * 3.80;
            if (numbFlowers > 90) {
                price *= 0.85;
            }
        }else if (flowers.equals("Tulips")) {
            price = numbFlowers * 2.80;
            if (numbFlowers > 80) {
                price *= 0.85;
            }
        }else if (flowers.equals("Narcissus")) {
            price = numbFlowers * 3;
            if (numbFlowers < 120) {
                price *= 1.15;
            }
        }else if (flowers.equals("Gladiolus")) {
            price = numbFlowers * 2.50;
            if (numbFlowers < 80) {
                price *= 1.20;
            }
        }
        if (price <= budget) {
            double left = Math.abs(price - budget);
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numbFlowers, flowers, left);
        }else {
            double needed = Math.abs(price - budget);
            System.out.printf("Not enough money, you need %.2f leva more.", needed);
        }
    }
}
