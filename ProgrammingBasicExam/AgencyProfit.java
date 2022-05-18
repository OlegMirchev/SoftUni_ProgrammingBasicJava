package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameComp = scanner.nextLine();
        int ticketsOld = Integer.parseInt(scanner.nextLine());
        int ticketsKid = Integer.parseInt(scanner.nextLine());
        double netPriceOld = Double.parseDouble(scanner.nextLine());
        double charge = Double.parseDouble(scanner.nextLine());

        double netPriceKid = netPriceOld * 0.30;
        double priceChargeOld = netPriceOld + charge;
        double priceChargeKid = netPriceKid + charge;
        double allPriceTickets = ticketsOld * priceChargeOld + ticketsKid * priceChargeKid;
        double prize = allPriceTickets * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameComp, prize);
    }
}
