package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String winnerNameGamer = "";
        int max = Integer.MIN_VALUE;

        while (!command.equals("Stop")) {
            String nameGamer = command;
            int pointsGamer = 0;

            for (int i = 0; i < nameGamer.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());
                char letter = nameGamer.charAt(i);

                if (letter == number) {
                    pointsGamer += 10;
                } else {
                    pointsGamer += 2;
                }
            }
            if (pointsGamer >= max) {
                max = pointsGamer;
                winnerNameGamer = nameGamer;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winnerNameGamer, max);
    }
}
