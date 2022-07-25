package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double priceN = n * 250;
        double priceM = (priceN * 0.35) * m;
        double priceP = (priceN * 0.10) * p;
        double sum = priceN + priceM + priceP;

        if (n > m) {
            sum *= 0.85;
        }
        if (sum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - sum);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - sum));
        }
    }
}
