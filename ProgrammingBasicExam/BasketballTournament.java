package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameTournaments = scanner.nextLine();
        int countWin = 0;
        int countLost = 0;
        int allMach = 0;

        while (!nameTournaments.equals("End of tournaments")) {
            int numbMach = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= numbMach; i++) {
                int pointsTeamDesi = Integer.parseInt(scanner.nextLine());
                int pointsTeamOpponent = Integer.parseInt(scanner.nextLine());
                allMach++;

                if (pointsTeamDesi > pointsTeamOpponent) {
                    countWin++;
                    System.out.printf("Game %d of tournament" +
                            " %s: win with %d points.%n", i, nameTournaments, pointsTeamDesi - pointsTeamOpponent);
                }else {
                    countLost++;
                    System.out.printf("Game %d of tournament" +
                            " %s: lost with %d points.%n", i, nameTournaments, pointsTeamOpponent - pointsTeamDesi);
                }
            }
            nameTournaments = scanner.nextLine();
        }
        double averageWin = (countWin * 1.00 / allMach) * 100;
        double averageLost = (countLost * 1.00 / allMach) * 100;

        System.out.printf("%.2f%% matches win%n", averageWin);
        System.out.printf("%.2f%% matches lost", averageLost);
    }
}
