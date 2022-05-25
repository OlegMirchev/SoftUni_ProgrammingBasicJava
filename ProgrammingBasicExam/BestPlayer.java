package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namePlayer = scanner.nextLine();
        int goals = 0;
        String bestPlayer = "";

        while (!namePlayer.equals("END")) {
            int numbGoals = Integer.parseInt(scanner.nextLine());
            if (numbGoals > goals) {
                goals = numbGoals;
                bestPlayer = namePlayer;
            }
            if (goals >= 10) {
                break;
            }
            namePlayer = scanner.nextLine();
        }
        if (goals >= 3) {
            System.out.printf("%s is the best player!%n" +
                    "He has scored %d goals and made a hat-trick !!!", bestPlayer, goals);
        }else {
            System.out.printf("%s is the best player!%n" +
                    "He has scored %d goals.", bestPlayer, goals);
        }
    }
}
