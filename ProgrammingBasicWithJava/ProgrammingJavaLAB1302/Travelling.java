package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1302;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destinations = scanner.nextLine();
        double sum = 0.0;

        while (!destinations.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            while (budget > sum) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum += amount;
            }
            System.out.printf("Going to %s!%n", destinations);
            sum = 0;


            destinations = scanner.nextLine();
        }
    }
}
