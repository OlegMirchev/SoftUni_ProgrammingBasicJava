package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double prizeClub = Double.parseDouble(scanner.nextLine());
        double wishPrizeClub = prizeClub;
        double clubIncome = 0.0;
        boolean isValid = false;


        while (prizeClub > 0) {
            String nameCocktails = scanner.nextLine();
            if (nameCocktails.equals("Party!")) {
                isValid = true;
                break;
            }
            int numbCocktails = Integer.parseInt(scanner.nextLine());
            double priceCocktails = nameCocktails.length() * numbCocktails;
            if (priceCocktails % 2 != 0) {
                priceCocktails *= 0.75;
            }
            clubIncome += priceCocktails;
            prizeClub -= priceCocktails;
        }
        if (isValid) {
            System.out.printf("We need %.2f leva more.%n" +
                    "Club income - %.2f leva.", wishPrizeClub - clubIncome, clubIncome);
        }else {
            System.out.printf("Target acquired.%n" +
                    "Club income - %.2f leva.", clubIncome);
        }
    }
}
