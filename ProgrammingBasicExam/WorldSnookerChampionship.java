package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stageTournaments = scanner.nextLine();
        String typeTickets = scanner.nextLine();
        int numbTickets = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double price = 0.0;
        boolean isValid = false;

        if (typeTickets.equals("Standard")) {
            switch (stageTournaments) {
                case "Quarter final":
                    price = 55.50;
                    break;
                case "Semi final":
                    price = 75.88;
                    break;
                case "Final":
                    price = 110.10;
                    break;
            }
        } else if (typeTickets.equals("Premium")) {
            switch (stageTournaments) {
                case "Quarter final":
                    price = 105.20;
                    break;
                case "Semi final":
                    price = 125.22;
                    break;
                case "Final":
                    price = 160.66;
                    break;
            }
        } else if (typeTickets.equals("VIP")) {
            switch (stageTournaments) {
                case "Quarter final":
                    price = 118.90;
                    break;
                case "Semi final":
                    price = 300.40;
                    break;
                case "Final":
                    price = 400;
                    break;
            }
        }
        double priceTickets = numbTickets * price;
        if (priceTickets > 4000) {
            priceTickets *= 0.75;
            isValid = true;
        } else if (priceTickets > 2500) {
            priceTickets *= 0.90;
        }
        if (symbol.equals("Y") && !isValid) {
            numbTickets *= 40;
            priceTickets += numbTickets;
        }

        System.out.printf("%.2f", priceTickets);
    }
}
