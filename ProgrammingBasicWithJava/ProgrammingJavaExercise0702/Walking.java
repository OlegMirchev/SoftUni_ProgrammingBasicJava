package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex0702;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = 10000;
        String command = scanner.nextLine();
        int sumSteps = 0;

        while (!command.equals("Going home")) {
            int stepsDays = Integer.parseInt(command);
            sumSteps += stepsDays;
            if (sumSteps >= steps) {

                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            sumSteps += stepsToHome;


        }
        if (sumSteps >= steps) {
            int more = sumSteps - steps;
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", more);
        }else {
            int diff = steps - sumSteps;
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
