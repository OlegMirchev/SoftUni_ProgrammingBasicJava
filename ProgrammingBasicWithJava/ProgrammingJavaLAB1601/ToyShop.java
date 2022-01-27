package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1601;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceHoliday = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sumPuzzles = puzzles * 2.60;
        double sumDolls = dolls * 3;
        double sumTeddyBears = teddyBears * 4.10;
        double sumMinions = minions * 8.20;
        double sumTrucks = trucks * 2;
        double prizeToys = sumPuzzles + sumDolls + sumTeddyBears + sumMinions + sumTrucks;
        double toysNumber = puzzles + dolls + teddyBears + minions + trucks;

        if (toysNumber >= 50) {
            prizeToys *= 0.75;
        }
        prizeToys *= 0.90;
        if (prizeToys >= priceHoliday) {
            System.out.printf("Yes! %.2f lv left.", prizeToys - priceHoliday);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", priceHoliday - prizeToys);
        }

    }
}
