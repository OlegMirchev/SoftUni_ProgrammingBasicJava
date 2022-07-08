package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFilm = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTickets = Double.parseDouble(scanner.nextLine());
        int percentForCinema = Integer.parseInt(scanner.nextLine());

        double priceTicketsPerDay = tickets * priceTickets;
        double incomeAllPeriod = priceTicketsPerDay * days;
        double percentFromIncome = incomeAllPeriod * percentForCinema / 100;
        double totalIncome = incomeAllPeriod - percentFromIncome;

        System.out.printf("The profit from the movie %s is %.2f lv.", nameFilm, totalIncome);
    }
}
