package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FootballResults2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result1 = scanner.nextLine();
        String result2 = scanner.nextLine();
        String result3 = scanner.nextLine();
        int teamWon = 0;
        int teamLost = 0;
        int teamDrawn = 0;
        char[] letter1 = result1.toCharArray();
        char[] letter2 = result2.toCharArray();
        char[] letter3 = result3.toCharArray();

        if (letter1[0] > letter1[2]) {
            teamWon += 1;
        }else if (letter1[0] < letter1[2]) {
            teamLost += 1;
        }else {
            teamDrawn += 1;
        }
        if (letter2[0] > letter2[2]) {
            teamWon += 1;
        }else if (letter2[0] < letter2[2]) {
            teamLost += 1;
        }else {
            teamDrawn += 1;
        }
        if (letter3[0] > letter3[2]) {
            teamWon += 1;
        }else if (letter3[0] < letter3[2]) {
            teamLost += 1;
        }else {
            teamDrawn += 1;
        }
        System.out.printf("Team won %d games.%n", teamWon);
        System.out.printf("Team lost %d games.%n", teamLost);
        System.out.printf("Drawn games: %d", teamDrawn);
    }
}
