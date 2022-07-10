package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String nameActor = scanner.nextLine();
        boolean isValid = false;
        double neededBudget = 0.0;

        while (!nameActor.equals("ACTION")) {
            if (nameActor.length() > 15) {
                budget *= 0.80;
                nameActor = scanner.nextLine();
                continue;
            }
            double salaryActor = Double.parseDouble(scanner.nextLine());
            if (salaryActor > budget) {
                isValid = true;
                neededBudget = salaryActor - budget;
                break;
            }
            budget -= salaryActor;
            nameActor = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("We need %.2f leva for our actors.", neededBudget);
        }else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
