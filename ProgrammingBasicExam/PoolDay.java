package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double chargeEnter = Double.parseDouble(scanner.nextLine());
        double priceSunbed = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double sumChargeEnter = people * chargeEnter;
        double sunbeds = Math.ceil(people * 0.75);
        double neededSunbed = sunbeds * priceSunbed;
        double umbrella = Math.ceil(people * 0.50);
        double neededUmbrella = umbrella * priceUmbrella;
        double totalSum = sumChargeEnter + neededSunbed + neededUmbrella;

        System.out.printf("%.2f lv.", totalSum);
    }
}
