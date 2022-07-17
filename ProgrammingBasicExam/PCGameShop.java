package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbSellGames = Integer.parseInt(scanner.nextLine());
        int counterHearthstone = 0;
        int counterFornite = 0;
        int counterOverwatch = 0;
        int counterOthers = 0;

        for (int i = 1; i <= numbSellGames; i++) {
            String nameGames = scanner.nextLine();

            switch (nameGames) {
                case "Hearthstone":
                    counterHearthstone++;
                    break;
                case "Fornite":
                    counterFornite++;
                    break;
                case "Overwatch":
                    counterOverwatch++;
                    break;
                default:
                    counterOthers++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", counterHearthstone * 1.00 / numbSellGames * 100);
        System.out.printf("Fornite - %.2f%%%n", counterFornite * 1.00 / numbSellGames * 100);
        System.out.printf("Overwatch - %.2f%%%n", counterOverwatch * 1.00 / numbSellGames * 100);
        System.out.printf("Others - %.2f%%%n", counterOthers * 1.00 / numbSellGames * 100);
    }
}
