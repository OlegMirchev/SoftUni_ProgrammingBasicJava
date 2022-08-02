package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysTournament = Integer.parseInt(scanner.nextLine());
        int winDays = 0;
        int loseDays = 0;
        double winMoney = 0.0;

        for (int i = 1; i <= daysTournament; i++) {
            String command = scanner.nextLine();
            int win = 0;
            int lose = 0;
            double money = 0.0;
            while (!command.equals("Finish")) {
                String result = command;
                if (result.equals("win")) {
                    money += 20;
                    win++;
                } else if (result.equals("lose")) {
                    lose++;
                }
                command = scanner.nextLine();
            }
            if (win > lose) {
                money *= 1.10;
                winDays++;
            } else {
                loseDays++;
            }
            winMoney += money;
        }
        if (winDays > loseDays) {
            winMoney *= 1.20;
        }
        if (winDays > loseDays) {
            System.out.printf("You won the tournament! Total raised money: %.2f", winMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", winMoney);
        }
    }
}
