package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFootballTeam = scanner.nextLine();
        int numbFootballMeets = Integer.parseInt(scanner.nextLine());
        int counterW = 0;
        int counterD = 0;
        int counterL= 0;
        int pointsW= 0;
        int pointsD= 0;

        for (int i = 1; i <= numbFootballMeets; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    counterW++;
                    pointsW += 3;
                    break;
                case "D":
                    counterD++;
                    pointsD++;
                    break;
                case "L":
                    counterL++;
                    break;
            }
        }
        if (numbFootballMeets == 0) {
            System.out.printf("%s hasn't played any games during this season.", nameFootballTeam);
        }else {
            System.out.printf("%s has won %d points during this season.%n", nameFootballTeam, pointsW + pointsD);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", counterW);
            System.out.printf("## D: %d%n", counterD);
            System.out.printf("## L: %d%n", counterL);
            System.out.printf("Win rate: %.2f%%", counterW * 1.00 / numbFootballMeets * 100);
        }
    }
}
