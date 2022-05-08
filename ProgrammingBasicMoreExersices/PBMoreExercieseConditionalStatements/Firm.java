package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numbWorkersOut = Integer.parseInt(scanner.nextLine());

        double realDays = days * 0.90;
        double realHours = realDays * 8;
        double workersOutHours = numbWorkersOut * days * 2;
        double allHours = Math.floor(realHours + workersOutHours);

        if (allHours >= neededHours) {
            double left = allHours - neededHours;
            System.out.printf("Yes!%.0f hours left.", left);
        }else {
            double needed = neededHours - allHours;
            System.out.printf("Not enough time!%.0f hours needed.", needed);
        }


    }
}
