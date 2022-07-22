package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double neededGas = Double.parseDouble(scanner.nextLine());
        String dayWeek = scanner.nextLine();

        double priceGas = neededGas * 2.10;
        double sum = priceGas + 100;

        if (dayWeek.equals("Saturday")) {
            sum *= 0.90;
        }else if (dayWeek.equals("Sunday")) {
            sum *= 0.80;
        }
        if (sum <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv. ", budget - sum);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(budget - sum));
        }
    }
}
