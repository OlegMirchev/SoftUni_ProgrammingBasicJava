package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFirstGamer = scanner.nextLine();
        String nameSecondGamer = scanner.nextLine();
        String command = scanner.nextLine();
        int pointsFirst = 0;
        int pointsSecond = 0;
        int count = 0;


        while (!command.equals("End of game")) {
            int cardFirstGamer = Integer.parseInt(command);
            command = scanner.nextLine();
            int cardSecondGamer = Integer.parseInt(command);

            if (cardFirstGamer > cardSecondGamer) {
                if (count == 1) {
                    System.out.printf("%s is winner with %d points", nameFirstGamer, pointsFirst);
                    break;
                }
                pointsFirst += cardFirstGamer - cardSecondGamer;
            }else if (cardSecondGamer > cardFirstGamer) {
                if (count == 1) {
                    System.out.printf("%s is winner with %d points", nameSecondGamer, pointsSecond);
                    break;
                }
                pointsSecond += cardSecondGamer - cardFirstGamer;
            }else {
                System.out.println("Number wars!");
                count++;
                command = scanner.nextLine();
                continue;
            }
                command = scanner.nextLine();
        }
        if (command.equals("End of game")) {
            System.out.printf("%s has %d points%n", nameFirstGamer, pointsFirst);
            System.out.printf("%s has %d points", nameSecondGamer, pointsSecond);
        }

    }
}
