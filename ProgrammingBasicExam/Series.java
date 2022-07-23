package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numbSeries = Integer.parseInt(scanner.nextLine());
        double totalSumSeries = 0.0;

        for (int i = 1; i <= numbSeries; i++) {
            String nameSeries = scanner.nextLine();
            double priceSeries = Double.parseDouble(scanner.nextLine());

            switch (nameSeries) {
                case "Thrones":
                    priceSeries *= 0.50;
                    break;
                case "Lucifer":
                    priceSeries *= 0.60;
                    break;
                case "Protector":
                    priceSeries *= 0.70;
                    break;
                case "TotalDrama":
                    priceSeries *= 0.80;
                    break;
                case "Area":
                    priceSeries *= 0.90;
                    break;
            }
            totalSumSeries += priceSeries;
        }
        if (budget >= totalSumSeries) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalSumSeries);
        }else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget - totalSumSeries));
        }
    }
}
