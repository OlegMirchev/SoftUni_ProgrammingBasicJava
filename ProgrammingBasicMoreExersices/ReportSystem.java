package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumSold = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int count = 0;
        int countCash = 0;
        int countCard = 0;
        double allSum = 0.0;
        double cashSum = 0.0;
        double cardSum = 0.0;
        boolean isValid = false;

        while (!command.equals("End")) {
            int priceObjects = Integer.parseInt(command);
            count++;
            if (count % 2 == 0) {
                if (priceObjects < 10) {
                    System.out.println("Error in transaction!");
                }else {
                    System.out.println("Product sold!");
                    allSum += priceObjects;
                    cardSum += priceObjects;
                    countCard++;
                }
            }else {
                if (priceObjects > 100) {
                    System.out.println("Error in transaction!");
                }else {
                    System.out.println("Product sold!");
                    allSum += priceObjects;
                    cashSum += priceObjects;
                    countCash++;
                }
            }
            if (allSum >= sumSold) {
                isValid = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (isValid) {
            cashSum /= countCash;
            cardSum /= countCard;
            System.out.printf("Average CS: %.2f%n", cashSum);
            System.out.printf("Average CC: %.2f", cardSum);
        }else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
