package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1001;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int confectioners = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancake = Integer.parseInt(scanner.nextLine());

        double sumCake = cakes * 45;
        double sumWaffles = waffles * 5.80;
        double sumPancake = pancake * 3.20;
        double sumConfectioners = (sumCake + sumWaffles + sumPancake) * confectioners;
        double campaign = sumConfectioners * days;
        double expenses = campaign - (campaign / 1 / 8);

        System.out.printf("%.2f", expenses);

    }
}
