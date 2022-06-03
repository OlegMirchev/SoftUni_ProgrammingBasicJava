package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameGamer = scanner.nextLine();
        String command = scanner.nextLine();
        int startPoints = 301;
        int countSuccess = 0;
        int countFailure = 0;
        boolean isValid = false;
        int pointsGame = 0;

        while (!command.equals("Retire")) {
            String area = command;
            int points = Integer.parseInt(scanner.nextLine());

            if (startPoints >= points) {
                countSuccess++;
                switch (area) {
                    case "Single":
                        startPoints -= points;
                        break;
                    case "Double":
                        pointsGame = points * 2;
                        if (pointsGame > startPoints) {
                            countFailure++;
                            countSuccess--;
                            command = scanner.nextLine();
                            continue;
                        }
                        startPoints -= pointsGame;
                        break;
                    case "Triple":
                        pointsGame = points * 3;
                        if (pointsGame > startPoints) {
                            countFailure++;
                            countSuccess--;
                            command = scanner.nextLine();
                            continue;
                        }
                        startPoints -= pointsGame;
                        break;
                }
            } else {
                countFailure++;
            }
            if (startPoints == 0) {
                isValid = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("%s won the leg with %d shots.", nameGamer, countSuccess);
        }else {
            System.out.printf("%s retired after %d unsuccessful shots.", nameGamer, countFailure);
        }
    }
}
