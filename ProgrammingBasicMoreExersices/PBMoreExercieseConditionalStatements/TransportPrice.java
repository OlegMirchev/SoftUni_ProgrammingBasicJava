package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String daysNight = scanner.nextLine();

        if (n < 20) {
            if (daysNight.equals("day")) {
                double taxi = 0.70 + n * 0.79;
                System.out.printf("%.2f", taxi);
            }
            if (daysNight.equals("night")) {
                double taxi = 0.70 + n * 0.90;
                System.out.printf("%.2f", taxi);
            }
        }else if (n < 100) {
            if (daysNight.equals("day") || daysNight.equals("night")) {
                double bus = n * 0.09;
                System.out.printf("%.2f", bus);
            }
        }else{
            double train = n * 0.06;
            System.out.printf("%.2f", train);
        }

    }
}
