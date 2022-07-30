package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbCompetitions = Integer.parseInt(scanner.nextLine());
        int numbPointsRanklist = Integer.parseInt(scanner.nextLine());
        int pointsWFSF = 0;
        int countWinners = 0;

        for (int i = 1; i <= numbCompetitions; i++) {
            String typeCompetitions = scanner.nextLine();

            switch (typeCompetitions) {
                case "W":
                    numbPointsRanklist += 2000;
                    pointsWFSF += 2000;
                    countWinners++;
                    break;
                case "F":
                    numbPointsRanklist += 1200;
                    pointsWFSF += 1200;
                    break;
                case "SF":
                    numbPointsRanklist += 720;
                    pointsWFSF += 720;
                    break;
            }
        }
        int averagePoints = pointsWFSF / numbCompetitions;
        double percentWinnersCompetitions = (countWinners * 1.00 / numbCompetitions) * 100;

        System.out.printf("Final points: %d%n", numbPointsRanklist);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percentWinnersCompetitions);
    }
}
