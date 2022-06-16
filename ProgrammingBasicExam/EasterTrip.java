package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destinations = scanner.nextLine();
        String dateHoliday = scanner.nextLine();
        int numbNights = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (destinations.equals("France")) {
            switch (dateHoliday) {
                case "21-23":
                    price = 30;
                    break;
                case "24-27":
                    price = 35;
                    break;
                case "28-31":
                    price = 40;
                    break;
            }
        }else if (destinations.equals("Italy")) {
            switch (dateHoliday) {
                case "21-23":
                    price = 28;
                    break;
                case "24-27":
                    price = 32;
                    break;
                case "28-31":
                    price = 39;
                    break;
            }
        }else if (destinations.equals("Germany")) {
            switch (dateHoliday) {
                case "21-23":
                    price = 32;
                    break;
                case "24-27":
                    price = 37;
                    break;
                case "28-31":
                    price = 43;
                    break;
            }
        }
        double totalSum = numbNights * price;
        System.out.printf("Easter trip to %s : %.2f leva.", destinations, totalSum);
    }
}
