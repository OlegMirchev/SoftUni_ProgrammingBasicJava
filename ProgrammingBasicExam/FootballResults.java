package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teamWon = 0;
        int teamLost = 0;
        int teamDrawn = 0;

        for (int i = 0; i < 3; i++) {
            String result = scanner.nextLine();
            char[] letter = result.toCharArray();

            int first = letter[0];
            int second = letter[2];


            if (first > second) {
                teamWon++;
            } else if (first < second) {
                teamLost++;
            } else {
                teamDrawn++;
            }
        }
        System.out.printf("Team won %d games.%n", teamWon);
        System.out.printf("Team lost %d games.%n", teamLost);
        System.out.printf("Drawn games: %d", teamDrawn);
    }
}
